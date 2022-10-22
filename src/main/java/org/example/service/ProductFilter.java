package org.example.service;

import org.example.model.Fabricator;
import org.example.model.Product;

import java.util.List;

public interface ProductFilter {

    List<Product> filterByPrice(int max, int min);

    List<Product> filterByFabricator(Fabricator fabricator);

    List<Product> filterByName(String name);
}
