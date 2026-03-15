

package com.trendfoots.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.trendfoots.entity.Product;
import com.trendfoots.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductService service;

    // ✅ MANUAL CONSTRUCTOR (IMPORTANT)
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return service.save(product);
    }
}
