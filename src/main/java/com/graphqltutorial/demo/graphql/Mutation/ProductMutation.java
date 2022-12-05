package com.graphqltutorial.demo.graphql.Mutation;

import com.graphqltutorial.demo.Entity.Product;
import com.graphqltutorial.demo.Entity.Seller;
import com.graphqltutorial.demo.Service.ProductService;
import com.graphqltutorial.demo.Service.SellerService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductMutation implements GraphQLMutationResolver {
    private final ProductService productService;
    private final SellerService sellerService;

    public Product newProduct(Product product) {
        Seller seller = sellerService.findAll().get(0);
        product.setSeller(seller);
        return productService.create(product);
    }

    public Product updateProduct(Product product) {
        return productService.update(product);
    }

    public Product removeProduct(UUID id) {
        return productService.remove(id);
    }
}
