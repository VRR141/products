package org.example.dao;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductBagDAOImpl implements ProductBagDAO{

    private Map<Product, Integer> productMap = new HashMap<>();

    @Override
    public void put(Product product, int quantity) {
        productMap.put(product, quantity);
    }

    @Override
    public void put(Product product) {
        productMap.put(product, 1);
    }

    @Override
    public void remove(Product product) {
        productMap.remove(product);
    }

    @Override
    public List<Product> getProductList() {
        return new ArrayList<>(productMap.keySet());
    }

    @Override
    public String getProductBag() {
        StringBuilder sb = new StringBuilder();
        for (Product p: productMap.keySet()) {
            sb.append(p).append(" quantity: ").append(productMap.get(p)).append("\n");
        }
        return sb.toString();
    }
}
