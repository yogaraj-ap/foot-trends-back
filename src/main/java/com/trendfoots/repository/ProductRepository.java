package com.trendfoots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trendfoots.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
