package com.graphqltutorial.demo.Service;

import com.graphqltutorial.demo.Entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product getById(UUID id);
    List<Product> getAll();
    Product create(Product product);
    Product update(Product product);
    Product remove(UUID id);
}
