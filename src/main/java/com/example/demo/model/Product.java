package com.example.demo.model;

public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public Product(int price, int prodId, String prodName) {
        this.price = price;
        this.prodId = prodId;
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
