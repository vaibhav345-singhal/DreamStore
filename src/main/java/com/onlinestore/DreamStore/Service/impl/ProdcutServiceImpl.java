package com.onlinestore.DreamStore.Service.impl;

import com.onlinestore.DreamStore.Convertor.ProductConvertor;
import com.onlinestore.DreamStore.Exception.SellerNotFound;
import com.onlinestore.DreamStore.Model.Product;
import com.onlinestore.DreamStore.Model.Seller;
import com.onlinestore.DreamStore.Repository.ProductRepo;
import com.onlinestore.DreamStore.Repository.SellerRepo;
import com.onlinestore.DreamStore.RequestDtos.ProductRequestDto;
import com.onlinestore.DreamStore.ResponseDtos.ProductResponseDto;
import com.onlinestore.DreamStore.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdcutServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    SellerRepo sellerRepo;

    @Override
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws SellerNotFound {
        Product product = ProductConvertor.ProductRequestToProductConvertor(productRequestDto);

        Seller seller;
        try {
            seller = sellerRepo.findById(productRequestDto.getSellerId()).get();
        } catch (Exception e) {
            throw new SellerNotFound("Seller Not Found");
        }

        product.setSeller(seller);

        seller.getProducts().add(product);

        sellerRepo.save(seller);

        return ProductConvertor.ProductToProductResponseConvertor(product);
    }
}
