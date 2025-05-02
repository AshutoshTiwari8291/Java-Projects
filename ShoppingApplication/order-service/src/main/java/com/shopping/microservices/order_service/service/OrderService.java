package com.shopping.microservices.order_service.service;

import com.shopping.microservices.order_service.client.InventoryClient;
import com.shopping.microservices.order_service.dto.OrderRequest;
import com.shopping.microservices.order_service.event.OrderPlacedEvent;
import com.shopping.microservices.order_service.model.Order;
import com.shopping.microservices.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;
    private final KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;

    public void placeOrder(OrderRequest orderRequest) {
        var isProductInStock =  inventoryClient.isInStock(orderRequest.skucode(), orderRequest.quantity());

        if (isProductInStock) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setSkuCode(orderRequest.skucode());
            order.setQuantity(orderRequest.quantity());

            orderRepository.save(order);

            // Once the order is saved we send message to kafka topic
            // major field required is orderNumber and email

            OrderPlacedEvent orderPlacedEvent = new OrderPlacedEvent();
            orderPlacedEvent.setOrderNumber(order.getOrderNumber());
            orderPlacedEvent.setEmail(orderPlacedEvent.getEmail());
            orderPlacedEvent.setFirstName(orderRequest.userDetails().firstName());
            orderPlacedEvent.setLastName(orderRequest.userDetails().lastName());
            log.info("Start - Sending orderPlaced event {} to kafka topic order-placed", orderPlacedEvent);
            kafkaTemplate.send("OrderPlaced", orderPlacedEvent);
            log.info("End - Sending orderPlaced event {} to kafka topic order-placed", orderPlacedEvent);

        } else {
            throw new RuntimeException("Product with skucode " + orderRequest.skucode() + "  is not in stock");
        }

    }

}
