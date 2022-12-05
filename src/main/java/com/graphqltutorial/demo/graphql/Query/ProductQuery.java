package com.graphqltutorial.demo.graphql.Query;

import com.graphqltutorial.demo.Entity.Product;
import com.graphqltutorial.demo.Service.ProductService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductQuery implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> products() {
        return productService.getAll();
    }

    public Product product(UUID id) {
        return productService.getById(id);
    }
}
