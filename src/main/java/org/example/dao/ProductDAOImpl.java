package org.example.dao;

import org.example.model.Fabricator;
import org.example.model.ProductBuilder;


public class ProductDAOImpl implements ProductDAO{

    static{
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.setName("Praha")
                .setPrice(250)
                .setFabricator(Fabricator.METROPOL)
                .build();
        productBuilder.setName("Medovik")
                .setPrice(100)
                .setFabricator(Fabricator.CHUPA_CHUPS)
                .build();
        productBuilder.setName("Napoleon")
                .setPrice(439)
                .setFabricator(Fabricator.NEVSKIE_BEREGA)
                .build();
        productBuilder.setName("Vafelniy")
                .setPrice(79.99)
                .build();
        productBuilder.setName("Phili-Beiker")
                .setPrice(528)
                .setFabricator(Fabricator.BALTIYSKIY_HLEB)
                .build();
        productBuilder.setName("Grafskie Razvalini")
                .setPrice(289)
                .setFabricator(Fabricator.NEVSKIE_BEREGA)
                .build();
    }
}
