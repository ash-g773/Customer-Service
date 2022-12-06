package com.ash.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ash.entity.CustomerList;
import com.ash.service.CustomerService;

@RestController
public class CustomerResource {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(path = "/customers/{shareId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerList searchCustomerByShareIdResource(@PathVariable("shareId") int shareId) {
		//passing into the customer list constructor the service search method that returns a List<Customer> type
		return new CustomerList(service.searchCustomersByShareId(shareId));
	}
}
