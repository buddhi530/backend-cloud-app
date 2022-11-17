package com.example.backenddockerapp.serviceImpl;

import com.example.backenddockerapp.Entity.BookEntity;
import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;
import com.example.backenddockerapp.repository.BookRepository;
import com.example.backenddockerapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public String saveBook(CustomerRequestModel customerRequestModel) {
        try {
            BookEntity entity = new BookEntity();
            entity.setId(customerRequestModel.getId());
            entity.setTitle(customerRequestModel.getTitle());
            entity.setAuthor(customerRequestModel.getAuthor());
            entity.setCost(customerRequestModel.getCost());

            bookRepository.saveAndFlush(entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "saved";
    }

    @Override
    public List<Customer> getAllBook() {
        List<BookEntity> getCustomers = bookRepository.findAll();
        List<Customer> customerDTOList = new ArrayList<>();

        for(BookEntity c : getCustomers){

            Customer customerDTO = new Customer();
            //customerDTO.setId(c.getId());
            customerDTO.setTitle(c.getTitle());
            customerDTO.setAuthor(c.getAuthor());
            customerDTO.setCost(c.getCost());

            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

}
