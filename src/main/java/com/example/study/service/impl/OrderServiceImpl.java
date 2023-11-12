package com.example.study.service.impl;

import com.example.study.model.Order;
import com.example.study.repository.OrderRepository;
import com.example.study.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
	private final OrderRepository orderRepository;
	@Override public List<Order> findAll() {
		return orderRepository.findAll();
	}
}
