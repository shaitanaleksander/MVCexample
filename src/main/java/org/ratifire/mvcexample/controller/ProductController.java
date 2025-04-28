package org.ratifire.mvcexample.controller;

import org.ratifire.mvcexample.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Products")
public class ProductController {

    @GetMapping
    public List<Product> getProduct() {
        return List.of(
                new Product(1, "Laptop", "High-performance laptop"),
                new Product(2, "Smartphone", "Latest-gen smartphone"),
                new Product(3, "Headphones", "Noise-cancelling over-ear headphones"));
    }
}
