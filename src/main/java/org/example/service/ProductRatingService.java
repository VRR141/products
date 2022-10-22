package org.example.service;

import org.example.model.Product;
import org.example.model.Rating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRatingService {

    private static ProductRatingService instance;
    private List<Rating> ratings;

    private ProductRatingService(){
        this.ratings = new ArrayList<>();
    }

    public static ProductRatingService getInstance(){
        if (instance == null){
            instance = new ProductRatingService();
        }
        return instance;
    }

    public void addRating(Product product, double rating){
        ratings.add(new Rating(product, rating));
        sortRating();
    }

    public void removeFromRatingList(Product product){
        ratings.removeIf(r -> r.getProduct().equals(product));
    }

    public void changeRating(Product product, double rating){
        for (Rating r: ratings){
            if (r.getProduct().equals(product)){
                r.setRating(rating);
            }
        }
        sortRating();
    }

    private void sortRating(){
        Collections.sort(ratings, new Comparator<Rating>() {
            @Override
            public int compare(Rating o1, Rating o2) {
                return Double.compare(o2.getRating(), o1.getRating());
            }
        });
    }

    public String printRatings(){
        StringBuilder sb = new StringBuilder();
        for (Rating r: ratings){
            sb.append(r).append("\n");
        }
        return sb.toString();
    }

}
