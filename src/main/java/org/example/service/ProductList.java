package org.example.service;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private static ProductList instance;
    private List<Product> productList;

    private ProductList(){
        this.productList = new ArrayList<>();
    }

    public static ProductList getInstance(){
        if (instance == null){
            instance = new ProductList();
        }
        return instance;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public List<Product> getProductList(){
        return new ArrayList<>(productList);
    }

    public String getProductString(){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Product p: productList){
            sb.append(i++).append(". ").append(p).append("\n");
        }
        return sb.toString();
    }
}
