package com.dorin.dorin.service;

import com.dorin.dorin.model.Cart;
import com.dorin.dorin.model.Product;
import com.dorin.dorin.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Product> getProducts() {
        Cart cart = cartRepository.findById(1).orElse(new Cart());
        return cart.getProducts();
    }

    @Override
    public double getTotalPrice() {
        List<Product> products = getProducts();
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public void addProduct(Product product) {
        Cart cart = cartRepository.findById(1).orElse(new Cart());
        cart.getProducts().add(product);
        cartRepository.save(cart);
    }
}
