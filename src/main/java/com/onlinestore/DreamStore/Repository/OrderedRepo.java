package com.onlinestore.DreamStore.Repository;

import com.onlinestore.DreamStore.Model.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedRepo extends JpaRepository<Ordered, Integer> {
}
