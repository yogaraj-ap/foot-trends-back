package com.trendfoots.controller;

import com.trendfoots.entity.Order;
import com.trendfoots.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderService.getOrders();
    }
}