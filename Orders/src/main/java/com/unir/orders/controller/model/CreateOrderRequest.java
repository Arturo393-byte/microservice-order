package com.unir.orders.controller.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unir.orders.data.model.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder// se agrego
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
	private String  idorder;
	private Date    createddate;
	private Date    updateddate;
	private Double  total_items;
	private Double  total_taxes;
	private int  count;
	private Double 	total;
	private String  payment_transaction_id;
	private String  payment_transaction_response;
	private String  status;
	
	private List<Orderdetails> detalles = new ArrayList();
    

}
