package com.onlinestore.DreamStore.Service.impl;

import com.onlinestore.DreamStore.Convertor.SellerConvertor;
import com.onlinestore.DreamStore.Model.Seller;
import com.onlinestore.DreamStore.Repository.SellerRepo;
import com.onlinestore.DreamStore.RequestDtos.SellerRequestDto;
import com.onlinestore.DreamStore.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepo sellerRepo;

    @Override
    public String addSeller(SellerRequestDto sellerRequestDto) {
        Seller seller = SellerConvertor.sellerRequestToSellerConverter(sellerRequestDto);
        sellerRepo.save(seller);
        return "You are registered successfully.";
    }
}
