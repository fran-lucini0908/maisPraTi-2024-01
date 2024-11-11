package com.example.atividade16.factory;

import com.example.atividade16.model.Product;

public class ProductFactory {
    public static Product.ProductBuilder getBuilder(){
        return Product.builder()
                .id(SimpleFactory.getRandomLong())
                .description("Product Description")
                .name("Product Name")
                .quantity(5);
    }
}
