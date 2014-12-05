package com.github.silverbolt2014.price_tracker;

/**
 * The class Product is used to create objects that can represent a product at a store 
 */
public class Product {
    private static int nextId = 0;
    int id;
    String name;
    String upc;
    
    Product(int id, String name, String upc){
        this.id = ++Product.nextId;
        this.name = name;
        this.upc = upc;
    }
    
    int getId(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
    String getUPC(){
        return upc;
    }
    
    static int getNextId(){
        return Product.nextId;
    }
}