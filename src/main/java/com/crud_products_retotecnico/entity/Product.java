package com.crud_products_retotecnico.entity;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String product_name;
    @Column(nullable = false)
    private String categori;
    @Column(nullable = false)
    private Float price = 0F;
    private Integer cantidad_stock = 0;

    public Product(){ }

    public Product(Integer id, String product_name, String categori, Float price, Integer cantidad_stock) {
        this.id = id;
        this.product_name = product_name;
        this.categori = categori;
        this.price = price;
        this.cantidad_stock = cantidad_stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategori() {
        return categori;
    }

    public void setCategori(String categori) {
        this.categori = categori;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(Integer cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }
}
