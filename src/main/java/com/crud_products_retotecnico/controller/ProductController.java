package com.crud_products_retotecnico.controller;

import com.crud_products_retotecnico.entity.Product;
import com.crud_products_retotecnico.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        productService.deleteById(id);
    }

    @PutMapping
    public Product updateProduct( @RequestBody Product product){

        Product productDB = productService.findById(product.getId());

        productDB.setProduct_name(product.getProduct_name());
        productDB.setCategori(product.getCategori());
        productDB.setPrice(product.getPrice());
        productDB.setCantidad_stock(product.getCantidad_stock());

        return productService.update(productDB);
    }
}
