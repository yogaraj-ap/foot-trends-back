package com.trendfoots.service;

import com.trendfoots.entity.Order;
import com.trendfoots.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Order order){

        double total = order.getPrice() * order.getQuantity();
        order.setTotalAmount(total);

        return orderRepository.save(order);
    }

    // ✅ FIX (ADD THIS)
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
}