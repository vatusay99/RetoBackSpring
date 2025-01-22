package com.crud_products_retotecnico.repository;

import com.crud_products_retotecnico.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
