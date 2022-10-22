package org.example.model;

import java.text.DecimalFormat;

public class Rating {

    private double rating;
    private Product product;

    public Rating(Product product, double rating) {
        this.product = product;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Rating{" +
                "rating=" + decimalFormat.format(rating) +
                ", product=" + product +
                '}';
    }
}
