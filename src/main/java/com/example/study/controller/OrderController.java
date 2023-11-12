package com.example.study.controller;

import com.example.study.model.Order;
import com.example.study.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
	private final OrderService orderService;
	@GetMapping("/orders")
	public String orders() {
		List<Order> orderList = orderService.findAll();
		return "hello";
	}
}
