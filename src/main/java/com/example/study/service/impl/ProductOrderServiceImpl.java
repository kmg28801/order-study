package com.example.study.service.impl;

import com.example.study.model.ProductOrder;
import com.example.study.repository.ProductOrderRepository;
import com.example.study.service.ProductOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductOrderServiceImpl implements ProductOrderService {

	private final ProductOrderRepository productOrderRepository;

	public List<ProductOrder> findAll() {
		return productOrderRepository.findAll();
	}

	public void createProductOrder(ProductOrder productOrder) {
		productOrderRepository.save(productOrder);
	}
}
