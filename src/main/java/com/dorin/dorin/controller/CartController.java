package com.dorin.dorin.controller;

import com.dorin.dorin.model.Product;
import com.dorin.dorin.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return cartService.getProducts();
    }

    @GetMapping("/total")
    public double getTotalPrice() {
        return cartService.getTotalPrice();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        cartService.addProduct(product);
    }
}
