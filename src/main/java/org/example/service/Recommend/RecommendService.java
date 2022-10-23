package org.example.service.Recommend;

import org.example.model.Product;
import org.example.model.Rating;
import org.example.service.ProductRating.ProductRatingService;

import java.util.ArrayList;
import java.util.List;

public class RecommendService {

    private static int recommendCount = 3;
    private List<Rating> recommendList;

    public RecommendService() {
        this.recommendList = new ArrayList<>();
    }

    public List<Rating> getRecommendList(){
        List<Rating> temp = ProductRatingService.getInstance().getRatings();
        for (int i = 0; i < recommendCount; i++){
            recommendList.add(temp.get(i));
        }
        return recommendList;
    }

    public String getRecommend(){
        List<Rating> temp = getRecommendList();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RECOMMEND LIST: \n");
        for (int i = 0; i < temp.size(); i++){
            stringBuilder.append("TOP " + (recommendCount + 1) + " ").append(temp.get(i)).append("\n");
        }
        return stringBuilder.toString();
    }
}
