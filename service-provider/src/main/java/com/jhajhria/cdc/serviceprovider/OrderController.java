package com.jhajhria.cdc.serviceprovider;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/orders/{orderId}",produces = "application/json")
    public ResponseEntity<Order> getOrder(@PathVariable("orderId") String orderId) {
       Order order = orderService.getOrder(orderId);
       if(order == null) {
           return ResponseEntity.notFound().build();
       }

       return ResponseEntity.ok(order);
    }
}