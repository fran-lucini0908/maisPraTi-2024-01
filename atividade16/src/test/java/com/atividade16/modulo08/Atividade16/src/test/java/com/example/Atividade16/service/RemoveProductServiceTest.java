package com.example.atividade16.service;

import com.example.atividade16.factory.ProductFactory;
import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.service.utils.FindProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RemoveProductServiceTest {
    @InjectMocks
    private RemoveProductService removeProductService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private FindProductService findProductService;

    @Test
    @DisplayName("Must remove product")
    void testRemoveProduct() {
        Product product = ProductFactory.getBuilder().build();
        Long productId = product.getId();

        when(findProductService.byId(productId)).thenReturn(product);

        removeProductService.remove(productId);

        verify(productRepository).delete(product);
    }

}
