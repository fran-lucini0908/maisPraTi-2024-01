package com.example.atividade16.mapper;

import com.example.atividade16.factory.ProductFactory;
import com.example.atividade16.model.Product;
import com.example.atividade16.response.ProductResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ProductMapperTest {
    @Test
    @DisplayName("Must return valid response")
    public void mustReturnValidResponse(){
        Product product = ProductFactory.getBuilder().build();
        ProductResponse response = ProductMapper.toResponse(product);
        assertEquals(product.getId(), response.getId());
        assertEquals(product.getName(), response.getName());
        assertEquals(product.getDescription(), response.getDescription());
        assertEquals(product.getQuantity(), response.getQuantity());
    }
}
