package com.onlinestore.DreamStore.Convertor;

import com.onlinestore.DreamStore.Model.Seller;
import com.onlinestore.DreamStore.RequestDtos.SellerRequestDto;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Service;

@UtilityClass // these classes can't be instantiated
public class SellerConvertor {
    public static Seller sellerRequestToSellerConverter(SellerRequestDto sellerRequestDto) {
        return Seller.builder()
                .email(sellerRequestDto.getEmail())
                .mobNo(sellerRequestDto.getMobNo())
                .panNo(sellerRequestDto.getPanNo())
                .name(sellerRequestDto.getName())
                .build();
    }
}
