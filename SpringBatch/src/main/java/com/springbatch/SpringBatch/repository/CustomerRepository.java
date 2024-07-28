package com.springbatch.SpringBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbatch.SpringBatch.entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
