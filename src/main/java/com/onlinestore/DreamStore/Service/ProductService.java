package com.onlinestore.DreamStore.Service;

import com.onlinestore.DreamStore.Exception.SellerNotFound;
import com.onlinestore.DreamStore.RequestDtos.ProductRequestDto;
import com.onlinestore.DreamStore.ResponseDtos.ProductResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws SellerNotFound;
}
