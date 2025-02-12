package com.tns.ifet.customer.service;
import java.util.List;
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customerDetails);
    void deleteCustomer(Long id);
}

