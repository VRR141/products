package org.example.service.Delivery;

import org.example.service.ProductBagService.ProductBagService;

public interface DeliveryService {

    void deliveryOrder(ProductBagService productBag);

    void cancelDelivery(DeliveryService delivery);

    DeliveryService repeatDelivery(DeliveryService delivery);
}
