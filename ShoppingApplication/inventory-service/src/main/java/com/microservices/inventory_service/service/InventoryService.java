package com.microservices.inventory_service.service;

import com.microservices.inventory_service.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class InventoryService {

    private InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode,  Integer quantity) {
        log.info("herer" + skuCode + quantity);
        // Find an inventory for given skucode where quantiy > 0;
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
