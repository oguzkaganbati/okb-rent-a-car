package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer>
{
}
