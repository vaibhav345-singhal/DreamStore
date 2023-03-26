package com.onlinestore.DreamStore.RequestDtos;

import com.onlinestore.DreamStore.Enum.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequestDto {
    private String productName;

    private int price;

    private int quantity;
    private ProductCategory productCategory;

    private int sellerId;

}
