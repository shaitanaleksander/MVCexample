package org.ratifire.mvcexample.controller;

import org.ratifire.mvcexample.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("page/")
public class ProductPage {

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = List.of(
                new Product(1, "Laptop", "High-performance laptop"),
                new Product(2, "Smartphone", "Latest-gen smartphone"),
                new Product(3, "Headphones", "Noise-cancelling over-ear headphones")
        );
        model.addAttribute("products", products);
        return "product";
    }
}
