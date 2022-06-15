package com.example.springbootCrudApi.repository;

import com.example.springbootCrudApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);


}
