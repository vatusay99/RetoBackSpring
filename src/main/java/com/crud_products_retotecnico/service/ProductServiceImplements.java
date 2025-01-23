package com.crud_products_retotecnico.service;

import com.crud_products_retotecnico.entity.Product;
import com.crud_products_retotecnico.exection.ResourceNotFoundExcetion;
import com.crud_products_retotecnico.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplements implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplements(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundExcetion("Producto con Id: "+id+" No encontrado.");
                }
        );
        return product;
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
}
