package com.ash.entity;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity - we dont put this because otherwise it tries to map it to a table
public class CustomerList {

	private List<Customer> customers;
}
