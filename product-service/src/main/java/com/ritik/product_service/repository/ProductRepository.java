package com.ritik.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ritik.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
