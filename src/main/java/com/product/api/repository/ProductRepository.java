package com.product.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
