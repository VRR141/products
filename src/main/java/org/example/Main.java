package org.example;

import org.example.model.Fabricator;
import org.example.model.Product;
import org.example.model.ProductBuilder;
import org.example.service.*;

import java.util.*;

//TODO Трекинг заказа в системе доставки
//TODO Возврат заказа, повтороение заказа
//TODO Простая рекомендательная система для покупок

public class Main {

    public static void main(String[] args) {
        var b = getMockList();
        for (Product c: b){
            ProductRatingService.getInstance().addRating(c, Math.random()*(10));
        }
        System.out.println(ProductRatingService.getInstance().printRatings());
    }

    public static List<Product> getMockList(){
        ProductBuilder productBuilder = new ProductBuilder();
        List<Product> products = Arrays.asList(
                productBuilder.setName("Praha")
                        .setPrice(250)
                        .setFabricator(Fabricator.METROPOL)
                        .build(),
                productBuilder.setName("Medovik")
                        .setPrice(100)
                        .setFabricator(Fabricator.CHUPA_CHUPS)
                        .build(),
                productBuilder.setName("Napoleon")
                        .setPrice(439)
                        .setFabricator(Fabricator.NEVSKIE_BEREGA)
                        .build(),
                productBuilder.setName("Vafelniy")
                        .setPrice(79.99)
                        .build(),
                productBuilder.setName("Phili-Beiker")
                        .setPrice(528)
                        .setFabricator(Fabricator.BALTIYSKIY_HLEB)
                        .build(),
                productBuilder.setName("Grafskie Razvalini")
                        .setPrice(289)
                        .setFabricator(Fabricator.NEVSKIE_BEREGA)
                        .build()
        );
        return products;
    }
}