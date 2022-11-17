package com.example.backenddockerapp.repository;

import com.example.backenddockerapp.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}
