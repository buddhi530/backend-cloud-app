package com.example.backenddockerapp.controller;

import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;
import com.example.backenddockerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class CustomerController {
//    @Autowired
//    private CustomerService customerService;
//
//    @PostMapping(path="save",produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> saveCustomer(@RequestBody CustomerRequestModel customerRequestModel){
//        System.out.println("name1=>"+customerRequestModel.getAuthor());
//        String response=customerService.saveCustomer(customerRequestModel);
//        return  new ResponseEntity(response,HttpStatus.OK);
//    }
//
//    @GetMapping(path ="/get-all" )
//    public List<Customer> getAllCustomer(){
//        List<Customer> allCustomer =  customerService.getAllCustomer();
//        return allCustomer;
//    }

}
