package com.jhajhria.cdc.serviceprovider;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {

    static Map<String, Order> orders = Map.of(
            "1", new Order("1", "Sony TV", 500.00, 1),
            "2", new Order("2", "Samsung TV", 480.00, 1),
            "3", new Order("3", "Washing Machine", 1500.0, 1)
    );

    public Order getOrder(String orderId) {
        return orders.get(orderId);
    }


}

@Data
@AllArgsConstructor
 class Order {
    private String id;
    private String itemName;
    private double price;
    private int units;
}