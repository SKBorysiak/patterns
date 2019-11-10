package com.sda.facade;

public class Product {
    public void getAll(){
        System.out.println("All products");
    }
    public void getByCategory(String name){
        System.out.println("Products = " + name);
    }
}
