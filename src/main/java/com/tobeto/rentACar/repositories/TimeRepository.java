package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer>
{
}
