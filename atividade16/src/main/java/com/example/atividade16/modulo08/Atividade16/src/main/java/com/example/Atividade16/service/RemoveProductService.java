package com.example.atividade16.service;

import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.service.utils.FindProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FindProductService findProductByIdService;

    public void remove(Long id) {
        Product product = findProductByIdService.byId(id);

        productRepository.delete(product);

    }
}
