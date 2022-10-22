package org.example.model;

public class ProductBuilder {

    private String name;
    private Double price;
    private Fabricator fabricator;

    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public ProductBuilder setFabricator(Fabricator fabricator){
        this.fabricator = fabricator;
        return this;
    }

    private void flush(){
        if (name != null){
            name = null;
        }
        if (fabricator != null){
            fabricator = null;
        }
        if (price != null){
            price = null;
        }
    }

    public Product build(){
        if (name == null){
            throw new RuntimeException("no name product");
        }
        if (price == null && fabricator == null) {
            Product product = new Product(name);
            this.flush();
            return product;
        }
        if (price != null && fabricator == null){
            Product product = new Product(name, price);
            this.flush();
            return product;
        }
        if (price == null){
            Product product = new Product(name, fabricator);
            this.flush();
            return product;
        }
        Product product = new Product(name, price, fabricator);
        this.flush();
        return product;
    }
}
