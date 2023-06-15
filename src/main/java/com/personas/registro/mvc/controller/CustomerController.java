package com.personas.registro.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.personas.registro.model.Customer;
import com.personas.registro.service.ICustomerService;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping("/customers")
    public String listAllCustomers(Model model) {
        model.addAttribute("customers", service.listAllCustomers());
        // aca con mode y addAtribute le paso al html con thymeleaf la lista de
        // customers y el la guarda en "customers" y recupera con th:each="customer :
        // ${customers}"
        return "customers";
    }

    @GetMapping("/customers/new")
    public String showFormNewCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create_customer";
    }

    @PostMapping("/customers")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        service.addNewCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/update/{id}")
    public String showFormUpdateCustomer(@PathVariable Long id, Model model) {
        model.addAttribute("customer", service.getCustomerById(id));
        return "update_customer";
    }

    @PostMapping("/customers/{id}")
    public String updateCustomer(@PathVariable Long id, @ModelAttribute("customer") Customer customer, Model model) {
        Customer currentCustomer = service.getCustomerById(id);
        currentCustomer.setId(id);
        currentCustomer.setDni(customer.getDni());
        currentCustomer.setFullname(customer.getFullname());
        currentCustomer.setLocation(customer.getLocation());

        service.updateCustomer(currentCustomer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.deleteCustomerById(id);
        return "redirect:/customers";
    }
}
