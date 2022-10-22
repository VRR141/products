package org.example.service;

import org.example.dao.ProductBagDAO;
import org.example.dao.ProductBagDAOImpl;
import org.example.model.Product;

import java.util.List;

public class ProductBagServiceImpl implements ProductBagService{

    private ProductBagDAO productBagDAO = new ProductBagDAOImpl();


    @Override
    public void put(Product product, int quantity) {
        productBagDAO.put(product, quantity);
    }

    @Override
    public void put(Product product) {
        productBagDAO.put(product,1 );
    }

    @Override
    public void remove(Product product) {
        productBagDAO.remove(product);
    }

    @Override
    public List<Product> getProductList() {
        return productBagDAO.getProductList();
    }

    @Override
    public String getProductBag() {
        return productBagDAO.getProductBag();
    }

}
