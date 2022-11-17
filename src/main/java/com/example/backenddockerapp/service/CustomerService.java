package com.example.backenddockerapp.service;

import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;

import java.util.List;

public interface CustomerService {

    String saveCustomer(CustomerRequestModel customerRequestModel);

    List<Customer> getAllCustomer();
}
