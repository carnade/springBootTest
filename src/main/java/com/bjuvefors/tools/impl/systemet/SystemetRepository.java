package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Reductions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemetRepository extends JpaRepository<Reductions, Integer> {
}
