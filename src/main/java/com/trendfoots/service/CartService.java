package com.trendfoots.service;

import com.trendfoots.entity.Cart;
import com.trendfoots.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCartItems() {
        return cartRepository.findAll();
    }

    public void removeFromCart(Long id) {
        cartRepository.deleteById(id);
    }
}