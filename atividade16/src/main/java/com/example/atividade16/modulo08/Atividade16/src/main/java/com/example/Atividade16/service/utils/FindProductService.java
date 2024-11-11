package com.example.atividade16.service.utils;

import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class FindProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product byId(Long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Product not found."));
    }
}
