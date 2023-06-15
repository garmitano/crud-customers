package com.personas.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personas.registro.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
