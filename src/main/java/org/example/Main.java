package org.example;

import org.example.dao.ProductDAO;
import org.example.dao.ProductDAOImpl;
import org.example.service.ProductRating.ProductRatingService;
import org.example.service.Recommend.RecommendService;

public class Main {

    public static void main(String[] args) {
        RecommendService recommendService = new RecommendService();
        System.out.println(recommendService.getRecommend());

        System.out.println(ProductRatingService.getInstance().printRatings());
    }

    static {
        ProductDAO productDAO = new ProductDAOImpl();
    }

}