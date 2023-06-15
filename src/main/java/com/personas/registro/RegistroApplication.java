package com.personas.registro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personas.registro.model.Customer;
import com.personas.registro.repository.ICustomerRepository;

@SpringBootApplication
public class RegistroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}

	@Autowired
	private ICustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// Customer customer1 = new Customer(56532653, "Ernesto Arnaldo", "Catamarca");
		// Customer customer2 = new Customer(65326562, "Carolina Carola", "Entre Rios");

		// repository.save(customer1);
		// repository.save(customer2);
	}

}
