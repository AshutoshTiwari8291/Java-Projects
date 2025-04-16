package com.microservices.inventory_service.controller;

import com.microservices.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {
    private final InventoryService inventoryService;
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        log.info("This is " + skuCode + ":" + quantity);
        System.out.println("This is " + inventoryService + ":" + quantity);
        return inventoryService.isInStock(skuCode,quantity);
    }
}
