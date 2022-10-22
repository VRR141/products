package org.example.model;

import org.example.service.ProductList;

import java.util.Objects;

//POJO Product
public class Product {

    private int id;
    private String name;
    private double price;
    private static int counter;
    private Fabricator fabricator;

    public Product(String name, double price, Fabricator fabricator) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.fabricator = fabricator;
        ProductList.getInstance().addProduct(this);
    }

    public Product(String name, double price) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.fabricator = Fabricator.NO_NAME;
        ProductList.getInstance().addProduct(this);
    }

    public Product(String name, Fabricator fabricator) {
        this.id = counter++;
        this.name = name;
        this.fabricator = fabricator;
        ProductList.getInstance().addProduct(this);
    }

    public Product(String name) {
        this.id = counter++;
        this.name = name;
        this.fabricator = Fabricator.NO_NAME;
        ProductList.getInstance().addProduct(this);
    }



    public Fabricator getFabricator() {
        return fabricator;
    }

    public void setFabricator(Fabricator fabricator) {
        this.fabricator = fabricator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if (fabricator == null) {
            return String.format("Name: %s, price: " + price, name);
        }
        return String.format("Name : %s, price: " + price + ", fabricator: %s", name, fabricator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                fabricator == product.fabricator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, fabricator);
    }
}
