package com.onlinestore.DreamStore.Repository;

import com.onlinestore.DreamStore.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {
}
