package com.onlinestore.DreamStore.Repository;

import com.onlinestore.DreamStore.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card, Integer> {
}
