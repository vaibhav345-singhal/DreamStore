package com.onlinestore.DreamStore.Service;

import com.onlinestore.DreamStore.RequestDtos.SellerRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface SellerService {

    public String addSeller(@RequestBody SellerRequestDto sellerRequestDto);
}
