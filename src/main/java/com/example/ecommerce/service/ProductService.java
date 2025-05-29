package com.example.ecommerce.service;

import com.example.ecommerce.dto.ProductRequest;
import com.example.ecommerce.entity.Product;

public interface ProductService {
    Product createProduct(ProductRequest request);
}
