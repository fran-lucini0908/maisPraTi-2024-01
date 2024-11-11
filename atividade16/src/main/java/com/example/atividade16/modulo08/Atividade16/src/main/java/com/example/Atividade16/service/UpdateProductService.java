package com.example.atividade16.service;

import com.example.atividade16.mapper.ProductMapper;
import com.example.atividade16.model.Product;
import com.example.atividade16.repository.ProductRepository;
import com.example.atividade16.request.ProductRequest;
import com.example.atividade16.response.ProductResponse;
import com.example.atividade16.service.utils.FindProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UpdateProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FindProductService findProductByIdService;

    @Transactional
    public ProductResponse update(Long id, ProductRequest request) {
        Product product = findProductByIdService.byId(id);

        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setQuantity(request.getQuantity());

        productRepository.save(product);

        return ProductMapper.toResponse(product);
    }
}
