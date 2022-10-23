package org.example.service.ProductRating;

import org.example.model.Product;
import org.example.model.Rating;
import org.example.service.ProductList;

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
    }

    private void sortRating(){
        Collections.sort(ratings, new Comparator<Rating>() {
            @Override
            public int compare(Rating o1, Rating o2) {
                return Double.compare(o2.getRating(), o1.getRating());
            }
        });
    }

    public List<Rating> getRatings(){
        sortRating();
        return new ArrayList<>(ratings);
    }

    public String printRatings(){
        StringBuilder sb = new StringBuilder();
        List<Rating> temp = getRatings();
        for (Rating r: temp){
            sb.append(r).append("\n");
        }
        return sb.toString();
    }

    static {
        for (Product c: ProductList.getInstance().getProductList()){
            ProductRatingService.getInstance().addRating(c, Math.random()*(10));
        }
    }

}
