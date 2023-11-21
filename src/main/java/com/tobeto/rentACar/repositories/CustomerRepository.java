package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
}
