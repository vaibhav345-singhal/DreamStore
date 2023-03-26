package com.onlinestore.DreamStore.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellerRequestDto {
    private String name;
    private String email;
    private String mobNo;
    private String panNo;
}
