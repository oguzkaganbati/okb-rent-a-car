package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer>
{
}
