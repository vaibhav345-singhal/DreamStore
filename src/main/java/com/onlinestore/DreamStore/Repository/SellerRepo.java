package com.onlinestore.DreamStore.Repository;

import com.onlinestore.DreamStore.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {
}
