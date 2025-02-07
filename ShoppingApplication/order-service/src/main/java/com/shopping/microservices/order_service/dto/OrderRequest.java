package com.shopping.microservices.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
