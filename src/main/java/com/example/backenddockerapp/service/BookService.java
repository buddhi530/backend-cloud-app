package com.example.backenddockerapp.service;

import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;

import java.util.List;

public interface BookService {
    String saveBook(CustomerRequestModel customerRequestModel);

    List<Customer> getAllBook();

    boolean deleteCustomer(int id) throws Exception;
}
