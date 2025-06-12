
package com.unir.orders.service;

import java.util.Date;
import java.util.List;

import com.unir.orders.data.model.Order;
import com.unir.orders.data.model.Orderdetails;

import reactor.core.publisher.Mono;

import com.unir.orders.controller.model.OrderDto;
import com.unir.orders.controller.model.CreateOrderRequest;

public interface OrdersService {
	
	List<Order> getOrders(Date createddate, Date updateddate, Double total_items, Double total_taxes ,Double total);
	
	Order getOrder(String id_order);
	
	Boolean removeOrder(String id_order);
	
	Order createOrder(CreateOrderRequest request);

	Mono<Boolean> validarStock(List<Orderdetails> detalles);
	
	Order updateOrder(String id_order, String updateRequest);

	Order updateOrder(String productid_orderId, OrderDto updateRequest);

	
		
}
