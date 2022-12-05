package com.graphqltutorial.demo.graphql.Mutation;

import com.graphqltutorial.demo.Entity.Seller;
import com.graphqltutorial.demo.Service.SellerService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SellerMutation implements GraphQLMutationResolver {
    private final SellerService sellerService;

    public Seller newSeller(Seller seller) {
        return sellerService.createSeller(seller);
    }
}
