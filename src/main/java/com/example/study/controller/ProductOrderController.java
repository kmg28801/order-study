package com.example.study.controller;

import com.example.study.model.ProductOrder;
import com.example.study.service.ProductOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productOrder")
public class ProductOrderController {

	private final ProductOrderService productOrderService;

	@GetMapping("/productOrders")
	public String productOrders() {
		List<ProductOrder> productOrderList = productOrderService.findAll();
		return "productOrders";
	}
}
