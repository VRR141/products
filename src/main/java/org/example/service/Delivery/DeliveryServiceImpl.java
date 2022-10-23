package org.example.service.Delivery;

import org.example.service.ProductBagService.ProductBagService;

public class DeliveryServiceImpl implements DeliveryService{

    private ProductBagService productBagService;
    private String name;

    public DeliveryServiceImpl(ProductBagService productBagService, String name) {
        this.productBagService = productBagService;
        this.name = name;
    }

    @Override
    public void deliveryOrder(ProductBagService productBag) {
        System.out.println("Delivery start");
    }

    @Override
    public void cancelDelivery(DeliveryService delivery) {
        System.out.println("Delivery cancelled");
        this.productBagService = null;
    }

    @Override
    public DeliveryService repeatDelivery(DeliveryService delivery) {
        return new DeliveryServiceImpl(this.productBagService, this.name);
    }
}
