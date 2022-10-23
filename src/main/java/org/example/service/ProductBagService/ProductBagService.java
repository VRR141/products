package org.example.service.ProductBagService;

import org.example.model.Product;

import java.util.List;

public interface ProductBagService {

    void put(Product product, int quantity);

    void put(Product product);

    void remove(Product product);

    List<Product> getProductList();

    String getProductBag();


}
