package com.personas.registro.service;

import java.util.List;

import com.personas.registro.model.Customer;

public interface ICustomerService {
    public List<Customer> listAllCustomers();

    public Customer addNewCustomer(Customer customer);

    public Customer getCustomerById(Long id);

    public Customer updateCustomer(Customer customer);

    public void deleteCustomerById(Long id);
}
