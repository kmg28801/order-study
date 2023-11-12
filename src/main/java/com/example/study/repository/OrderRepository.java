package com.example.study.repository;

import com.example.study.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
	private final JdbcTemplate jdbcTemplate;
	private final String sql = "select ORDER_NO, MBR_ID, ADDRESS, ORDER_DATE from TBL_ORDER";

	public List<Order> findAll() {
		return jdbcTemplate.query(sql, new OrderRowMapper());
	}

	public static class OrderRowMapper implements RowMapper<Order> {
		@Override
		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			return Order.makeOrder(
				rs.getLong("ORDER_NO"),
				rs.getString("MBR_ID"),
				rs.getString("ADDRESS"),
				rs.getDate("ORDER_DATE")
			);
		}
	}
}
