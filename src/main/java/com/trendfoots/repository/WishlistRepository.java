package com.trendfoots.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trendfoots.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist,Long> {
}
