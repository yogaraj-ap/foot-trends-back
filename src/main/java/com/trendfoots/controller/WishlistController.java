package com.trendfoots.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendfoots.entity.Wishlist;
import com.trendfoots.repository.WishlistRepository;

@RestController
@RequestMapping("/api/wishlist")
@CrossOrigin(origins="http://localhost:5173")
public class WishlistController {

    private final WishlistRepository wishlistRepository;

    public WishlistController(WishlistRepository wishlistRepository){
        this.wishlistRepository = wishlistRepository;
    }

    @GetMapping
    public List<Wishlist> getWishlist(){
        return wishlistRepository.findAll();
    }

    @PostMapping
    public Wishlist addWishlist(@RequestBody Wishlist item){
        return wishlistRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void removeWishlist(@PathVariable Long id){
        wishlistRepository.deleteById(id);
    }
}
