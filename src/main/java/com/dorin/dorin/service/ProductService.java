package com.dorin.dorin.service;

import com.dorin.dorin.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product updateProduct(Product product);
    void deleteProduct(int id);
}
