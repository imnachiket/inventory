package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
