package com.shopping.microservices.inventory.controller;

import com.shopping.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        return inventoryService.isInStock(skuCode,quantity);
    }

    @GetMapping("/test-illegal-argument")
    public String testIllegalArgument() {
        throw new IllegalArgumentException("Intentional IllegalArgumentException for testing purposes");
    }
}
