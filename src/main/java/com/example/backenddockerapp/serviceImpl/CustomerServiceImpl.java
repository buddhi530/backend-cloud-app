package com.example.backenddockerapp.serviceImpl;

import com.example.backenddockerapp.Entity.CustomerEntity;
import com.example.backenddockerapp.model.Customer;
import com.example.backenddockerapp.model.CustomerRequestModel;
import com.example.backenddockerapp.repository.CustomerRepository;
import com.example.backenddockerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public String saveCustomer(CustomerRequestModel customerRequestModel) {
        try {
            CustomerEntity entity = new CustomerEntity();
            entity.setId(customerRequestModel.getId());
//            entity.setFirstName(customerRequestModel.getFirstName());
//            entity.setEmail(customerRequestModel.getEmail());
//            entity.setMobile(customerRequestModel.getMobile());
//            entity.setAddress(customerRequestModel.getAddress());
//            entity.setNic(customerRequestModel.getNic());
//            System.out.println("name"+customerRequestModel.getFirstName());
            customerRepository.saveAndFlush(entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "saved";
    }

    @Override
    public List<Customer> getAllCustomer() {

        List<CustomerEntity> getCustomers = customerRepository.findAll();
        List<Customer> customerDTOList = new ArrayList<>();

  for(CustomerEntity c : getCustomers){

      Customer customerDTO = new Customer();
            //customerDTO.setId(c.getId());
//            customerDTO.setFirstName(c.getFirstName());
//            customerDTO.setAddress(c.getAddress());
//            customerDTO.setEmail(c.getEmail());
//            customerDTO.setMobile(c.getMobile());
//            customerDTO.setNic(String.valueOf(c.getMobile()));
      customerDTOList.add(customerDTO);
 }
        return customerDTOList;
    }
}
