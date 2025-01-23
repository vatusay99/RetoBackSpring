package com.crud_products_retotecnico.service;

import com.crud_products_retotecnico.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Product findById(Integer id);

    void deleteById(Integer id);

    Product update(Product product);
}
