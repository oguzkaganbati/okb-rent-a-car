package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer>
{
}
