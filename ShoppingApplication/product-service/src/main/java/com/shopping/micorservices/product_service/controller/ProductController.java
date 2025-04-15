package com.shopping.micorservices.product_service.controller;

import com.shopping.micorservices.product_service.dto.ProductRequest;
import com.shopping.micorservices.product_service.dto.ProductResponse;
import com.shopping.micorservices.product_service.model.Product;
import com.shopping.micorservices.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProduct() {
        return productService.getAllProducts();
    }

}
