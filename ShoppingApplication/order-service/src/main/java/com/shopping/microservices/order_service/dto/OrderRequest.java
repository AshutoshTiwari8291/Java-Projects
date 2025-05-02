package com.shopping.microservices.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id,
                           String orderNumber,
                           String skucode,
                           BigDecimal price ,
                           Integer quantity,
                           UserDetails userDetails
                           ) {
    public record UserDetails(String email, String firstName, String lastName) {}
}

