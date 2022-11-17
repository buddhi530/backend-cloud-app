package com.example.backenddockerapp.repository;

import com.example.backenddockerapp.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
}
