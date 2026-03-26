package com.example.demo.services;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> product = new ArrayList<>(Arrays.asList(new Product(50000,100,"Laptop")));
    public List<Product> getProducts(){
        return product;
    }

    public List<Product> getProduct(int prodId){
        return product.stream().filter(f -> f.getProdId() ==prodId).toList();
    }

    public String addProduct(Product prodData){
        product.add(prodData);
        return "Data Inserted successfully!";
    }

    public void updateProduct(Product prod) {
        System.out.println(prod);
        int index =0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
            System.out.println(i);
        }
        product.set(index,prod);
    }

    public void deleteProduct(Product prod) {
        int index =0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
            System.out.println(i);
        }
        product.remove(index);
    }
}
