package com.unir.orders.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.unir.orders.data.utils.Consts;
import com.unir.orders.data.model.Orderdetails;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class OrderDetailRepository {

	private final OrderDetailJpaRepository repository;
    
	 public List<Orderdetails> saveAll(Orderdetails orderdetails) {
		 
		 List<Orderdetails> details = new ArrayList<>();
		 details.add(orderdetails);
				
	        return repository.saveAll(details);
	        
	        
	    }
	
}
