package com.ash.service;

import java.util.List;

import com.ash.entity.Customer;

public interface CustomerService {

	List<Customer> searchCustomersByShareId(int id);

}
