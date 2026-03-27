package com.example.demo.services;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo prRepo;

//    List<Product> product = new ArrayList<>(Arrays.asList(new Product(50000,100,"Laptop")));
    public List<Product> getProducts(){
        return prRepo.findAll();
    }

    public List<Product> getProduct(int prodId){
//        return product.stream().filter(f -> f.getProdId() ==prodId).toList();
        return Collections.singletonList(prRepo.findById(prodId).orElse(new Product()));
    }

    public String addProduct(Product prodData){
//        product.add(prodData);
        prRepo.save(prodData);
        return "Data Inserted successfully!";
    }

    public void updateProduct(Product prod) {
//        System.out.println(prod);
//        int index =0;
//        for(int i=0;i<product.size();i++){
//            if(product.get(i).getProdId() == prod.getProdId()){
//                index = i;
//            }
//            System.out.println(i);
//        }
//        product.set(index,prod);
        prRepo.save(prod);
    }

    public void deleteProduct(Product prod) {
//        int index =0;
//        for(int i=0;i<product.size();i++){
//            if(product.get(i).getProdId() == prod.getProdId()){
//                index = i;
//            }
//            System.out.println(i);
//        }
//        product.remove(index);
        prRepo.delete(prod);
    }
}
