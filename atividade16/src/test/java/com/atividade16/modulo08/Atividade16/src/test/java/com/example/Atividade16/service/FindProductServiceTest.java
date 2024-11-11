package com.example.atividade16.service;

import com.example.atividade16.factory.ProductFactory;
import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.service.utils.FindProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FindProductServiceTest {
    @InjectMocks
    private FindProductService findProductService;

    @Mock
    private ProductRepository productRepository;

    @Test
    @DisplayName("Must return a valid product")
    void mustReturnAValidProduct() {
        Product product = ProductFactory.getBuilder().build();
        when(productRepository
                .findById(product.getId()))
                .thenReturn(Optional.of(product));

        Product foundProduct = findProductService.byId(product.getId());

        verify(productRepository).findById(product.getId());

        assertEquals(foundProduct, product);
    }

    @Test
    @DisplayName("Must return an error")
    void mustReturnAnError() {
        ResponseStatusException exception = Assertions
                .assertThrows(ResponseStatusException.class, () -> {
                    findProductService.byId(null);
                });
        Assertions.assertEquals("Product not found.", exception.getReason());
    }
}
