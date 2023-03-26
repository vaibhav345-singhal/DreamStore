package com.onlinestore.DreamStore.Controller;

import com.onlinestore.DreamStore.Exception.SellerNotFound;
import com.onlinestore.DreamStore.Model.Product;
import com.onlinestore.DreamStore.RequestDtos.ProductRequestDto;
import com.onlinestore.DreamStore.ResponseDtos.ProductResponseDto;
import com.onlinestore.DreamStore.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ProductResponseDto addProduct(@RequestBody ProductRequestDto productRequestDto) throws SellerNotFound {
        ProductResponseDto productResponseDto;
        try {
            productResponseDto = productService.addProduct(productRequestDto);
        } catch (Exception e) {
            throw new SellerNotFound("Seller Not Found");
        }
        return productResponseDto;
    }
}
