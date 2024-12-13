package com.example.haziharom;

public class Product {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Price: $" + price;
    }
}
