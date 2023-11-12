package com.example.study.model;

import lombok.Getter;
import java.util.Date;

@Getter
public class Order {

	public static Order makeOrder(Long orderNo, String memberId, String address, Date orderDate) {
		return new Order(orderNo, memberId, address, orderDate);
	}

	private Order(Long orderNo, String memberId, String address, Date orderDate) {
		this.orderNo = orderNo;
		this.memberId = memberId;
		this.address = address;
		this.orderDate = orderDate;
	}

	private Long orderNo;

	private String memberId;

	private String address;

	private Date orderDate;




}
