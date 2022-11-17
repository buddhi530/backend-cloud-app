package com.example.backenddockerapp.controller;

import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;
import com.example.backenddockerapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path="save",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> saveBook(@RequestBody CustomerRequestModel customerRequestModel){
        System.out.println("name1=>"+customerRequestModel.getTitle());
        String response= bookService.saveBook(customerRequestModel);
        return  new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path ="/get-all" )
    public List<Customer> getAllBook(){
        List<Customer> allCustomer =  bookService.getAllBook();
        return allCustomer;
    }
}
