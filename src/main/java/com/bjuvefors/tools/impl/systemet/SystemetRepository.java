package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SystemetRepository extends JpaRepository<Item, Integer> {
}
