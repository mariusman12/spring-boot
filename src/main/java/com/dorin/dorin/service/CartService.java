package com.dorin.dorin.service;

import com.dorin.dorin.model.Product;
import java.util.List;

public interface CartService {
    List<Product> getProducts();
    double getTotalPrice();
    void addProduct(Product product);
}
