package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService prdctservice;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return prdctservice.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public List<Product> getProduct(@PathVariable int prodId){
        return prdctservice.getProduct(prodId);
    }

    @PostMapping("/products/add")
    public String addProduct(@RequestBody Product prodData){
        System.out.println(prodData);
        return prdctservice.addProduct(prodData);
    }

    @PutMapping("/product/update")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        prdctservice.updateProduct(prod);
    }

    @DeleteMapping("product/delete")
    public void deleteProduct(@RequestBody Product prod){
        prdctservice.deleteProduct(prod);
    }
}
