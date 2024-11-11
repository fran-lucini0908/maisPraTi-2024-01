package com.example.atividade16.service;

import com.example.atividade16.factory.ProductFactory;
import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.request.ProductRequest;
import com.example.atividade16.service.utils.FindProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateProductServiceTest {
    @InjectMocks
    private UpdateProductService updateProductService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private FindProductService findProductService;

    @Test
    @DisplayName("Must update product")
    void mustUpdateProduct() {
        ProductRequest productRequest = new ProductRequest();
        productRequest.setDescription("description");
        productRequest.setName("newName");
        productRequest.setQuantity(3);

        Product product = ProductFactory.getBuilder().build();
        Long productId = product.getId();;

        String updatedName = "newName";

        when(findProductService.byId(productId)).thenReturn(product);
        updateProductService.update(productId, productRequest);

        verify(findProductService).byId(productId);
        verify(productRepository).save(product);
        assertEquals(updatedName, product.getName());

    }
}
