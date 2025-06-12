package com.unir.orders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ApiService {
	
	  @Autowired
	
	   private WebClient webClient;
	  
	    
	    public Mono<String> getPostById(String id) {
	        return webClient.get()
	                .uri(uriBuilder -> uriBuilder
	                        .scheme("https")
	                        .host("fakestoreapi.com")
	                        .path("/products/{id}")
	                        .build(id))
	                .retrieve()	                
	                .bodyToMono(String.class);
	    }


}
