package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer>
{
}
