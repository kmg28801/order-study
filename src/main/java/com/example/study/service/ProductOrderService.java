package com.example.study.service;

import com.example.study.model.ProductOrder;

import java.util.List;

public interface ProductOrderService {
	List<ProductOrder> findAll();

	void createProductOrder(ProductOrder productOrder);
}
