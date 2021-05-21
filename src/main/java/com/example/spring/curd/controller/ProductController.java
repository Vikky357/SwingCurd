package com.example.spring.curd.controller;

import com.example.spring.curd.entity.Product;
import com.example.spring.curd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/v1/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/showProductById")
    public Long showProduct(@RequestParam Long id){

        return service.getProductById(id);
    }
}
