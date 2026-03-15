//package com.trendfoots.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import com.trendfoots.entity.Product;
//import com.trendfoots.repository.ProductRepository;
//
//@Service
//@RequiredArgsConstructor
//public class ProductService {
//
//    private final ProductRepository repo = null;
//
//    public List<Product> getAll() {
//        return repo.findAll();
//    }
//
//    public Product save(Product p) {
//        return repo.save(p);
//    }
//
//    public void delete(Long id) {
//        repo.deleteById(id);
//    }
//}


package com.trendfoots.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.trendfoots.entity.Product;
import com.trendfoots.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product save(Product product) {
        return repo.save(product);
    }
}
