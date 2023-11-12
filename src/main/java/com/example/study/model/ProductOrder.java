package com.example.study.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROD_ORDER")
@Getter
public class ProductOrder {
	@Id
	@Column(name = "PROD_ORDER_NO")
	private Long productOrderNo;

	@Column(name = "PROD_ORDER_NM")
	private String productOrderName;

	@Column(name = "PRICE")
	private Integer price;

	@Column(name = "QUANTITY")
	private Integer quantity;

	public static ProductOrder makeProductOrder(Long productOrderNo, String productOrderName, Integer price, Integer quantity) {
		return new ProductOrder(productOrderNo, productOrderName, price, quantity);
	}

	private ProductOrder(Long productOrderNo, String productOrderName, Integer price, Integer quantity) {
		this.productOrderNo = productOrderNo;
		this.productOrderName = productOrderName;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductOrder() {}
}
