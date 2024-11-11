package com.example.atividade16.mapper;

import com.example.atividade16.model.Product;
import com.example.atividade16.request.ProductRequest;
import com.example.atividade16.response.ProductResponse;

public class ProductMapper {

    public static Product toEntity(ProductRequest request) {
        Product product = new Product();
        product.setDescription(request.getDescription());
        product.setName(request.getName());
        product.setQuantity(request.getQuantity());

        return product;
    }

    public static ProductResponse toResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .quantity(product.getQuantity())
                .build();
    }
}
