_**Single-responsibility principle:**_ 
* [dao](https://github.com/VRR141/products/blob/main/src/main/java/org/example/dao/ProductDAOImpl.java)
* [model](https://github.com/VRR141/products/tree/main/src/main/java/org/example/model) ([Product](https://github.com/VRR141/products/blob/main/src/main/java/org/example/model/Product.java), [Fabricator](https://github.com/VRR141/products/blob/main/src/main/java/org/example/model/Fabricator.java), [ProductBuilder](https://github.com/VRR141/products/blob/main/src/main/java/org/example/model/ProductBuilder.java), [Rating](https://github.com/VRR141/products/blob/main/src/main/java/org/example/model/Rating.java))
* [service](https://github.com/VRR141/products/tree/main/src/main/java/org/example/service) ([DeliveryServiceImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/Delivery/DeliveryServiceImpl.java), [ProductBagServiceImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductBagService/ProductBagServiceImpl.java), [ProductFilterImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductFIlter/ProductFilterImpl.java), [ProductRatingService](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductRating/ProductRatingService.java), [RecommendService](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/Recommend/RecommendService.java), [ProductList](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductList.java))
  
Каждый класс в вышеуказанных пакетах отвечает за свою сущность.

_**Open-closed principle**_

При необходимости можно унаследовать и расширить функционал классов [Product](https://github.com/VRR141/products/blob/main/src/main/java/org/example/model/Product.java#L9), [DeliveryServiceImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/Delivery/DeliveryServiceImpl.java), [ProductFilterImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductFIlter/ProductFilterImpl.java).
Также данные классы закрыты для изменения функционала.

**_Liskov substitution principle_**

**_Interface segregation principle_**

Интерфейсы спроектированы согласно необходимому функционалу классов ([ProductFilter](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductFIlter/ProductFilter.java), [DeliveryService](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/Delivery/DeliveryService.java), [ProductBagService](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/ProductBagService/ProductBagService.java)).

**_Dependency inversion principle_**

Классы зависят от абстракций ([DeliveryServiceImpl](https://github.com/VRR141/products/blob/main/src/main/java/org/example/service/Delivery/DeliveryServiceImpl.java#L7))

