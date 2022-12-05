package com.graphqltutorial.demo.Service;

import com.graphqltutorial.demo.Entity.Seller;

import java.util.List;

public interface SellerService {
    Seller createSeller(Seller seller);
    List<Seller> findAll();
}
