package org.example.service.ProductFIlter;

import org.example.model.Fabricator;
import org.example.model.Product;
import org.example.service.ProductList;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilterImpl implements ProductFilter {


    @Override
    public List<Product> filterByPrice(int max, int min) {
        return getProductList().stream().
                filter(product -> product.getPrice() < max && product.getPrice() > min).
                collect(Collectors.toList());
    }

    @Override
    public List<Product> filterByFabricator(Fabricator fabricator) {
        return getProductList().stream().
                filter(product -> product.getFabricator() == fabricator).
                collect(Collectors.toList());
    }

    @Override
    public List<Product> filterByName(String name) {
        return getProductList().stream().
                filter(product -> product.getName().contains(name)).
                collect(Collectors.toList());
    }

    public List<Product> getProductList(){
        return ProductList.getInstance().getProductList();
    }
}
