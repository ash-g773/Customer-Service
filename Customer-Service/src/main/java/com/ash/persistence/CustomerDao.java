package com.ash.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ash.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	List<Customer> searchCustomerByShareId(int id);
	
}
