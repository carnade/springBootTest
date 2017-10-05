package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Reductions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SystemetRepository extends JpaRepository<Reductions, Integer> {

}
