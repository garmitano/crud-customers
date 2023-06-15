package com.personas.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personas.registro.model.Customer;
import com.personas.registro.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository repository;

    @Override
    public List<Customer> listAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return repository.save(customer);

    }

    @Override
    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

}
