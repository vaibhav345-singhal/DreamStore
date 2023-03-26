package com.onlinestore.DreamStore.Convertor;

import com.onlinestore.DreamStore.Enum.ProductStatus;
import com.onlinestore.DreamStore.Model.Product;
import com.onlinestore.DreamStore.RequestDtos.ProductRequestDto;
import com.onlinestore.DreamStore.ResponseDtos.ProductResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductConvertor {
    public static Product ProductRequestToProductConvertor(ProductRequestDto productRequestDto) {
        return Product.builder()
                .productName(productRequestDto.getProductName())
                .productCategory(productRequestDto.getProductCategory())
                .price(productRequestDto.getPrice())
                .quantity(productRequestDto.getQuantity())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponseDto ProductToProductResponseConvertor(Product product) {
        return ProductResponseDto.builder()
                .productStatus(product.getProductStatus())
                .name(product.getProductName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
    }
}
