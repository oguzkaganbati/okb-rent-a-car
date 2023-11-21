package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer>
{
}
