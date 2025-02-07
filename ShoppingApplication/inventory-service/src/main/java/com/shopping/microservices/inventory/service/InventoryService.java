package com.shopping.microservices.inventory.service;

import com.shopping.microservices.inventory.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        // Find and inventory for given skuCode where quantity  >= 0

        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
