package com.example.atividade16.service;

import com.example.atividade16.mapper.ProductMapper;
import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.request.ProductRequest;
import com.example.atividade16.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public ProductResponse add(ProductRequest request) {
        Product product = ProductMapper.toEntity(request);

        productRepository.save(product);

        return ProductMapper.toResponse(product);
    }
}
