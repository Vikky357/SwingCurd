package com.example.spring.curd.service;

import com.example.spring.curd.entity.Product;
import com.example.spring.curd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public Long getProductById(Long id) {
        Product product= repository.findByProductId(id);
        return product.getProductId();
    }

}
