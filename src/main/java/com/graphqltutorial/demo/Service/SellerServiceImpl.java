package com.graphqltutorial.demo.Service;

import com.graphqltutorial.demo.Entity.Seller;
import com.graphqltutorial.demo.Repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SellerServiceImpl implements SellerService{

    private SellerRepository sellerRepository;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }
}
