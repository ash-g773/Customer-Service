package com.ash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.entity.Customer;
import com.ash.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Override
	public List<Customer> searchCustomersByShareId(int id) {
		List<Customer> customers = dao.searchCustomerByShareId(id);
		return customers;
	}
}
