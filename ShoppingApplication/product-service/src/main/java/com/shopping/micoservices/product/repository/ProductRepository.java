package com.shopping.micoservices.product.repository;

import com.shopping.micoservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
