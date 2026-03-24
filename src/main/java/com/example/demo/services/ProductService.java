package com.example.demo.services;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> product = Arrays.asList(new Product(100,50000,"Laptop"));
    public List<Product> getProduct(){
        return product;
    }
}
