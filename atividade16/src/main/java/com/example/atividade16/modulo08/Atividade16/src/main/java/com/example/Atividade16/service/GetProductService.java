package com.example.atividade16.service;

import com.example.atividade16.mapper.ProductMapper;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GetProductService {
    @Autowired
    private ProductRepository productRepository;

    public Page<ProductResponse> list(Pageable pageable) {
        Page<ProductResponse> products = productRepository
                .findAll(pageable)
                .map(ProductMapper::toResponse);

        return products;
    }
}
