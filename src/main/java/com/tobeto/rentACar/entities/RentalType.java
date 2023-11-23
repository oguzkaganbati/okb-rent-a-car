package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "rental_types")
@Getter
@Setter
public class RentalType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rental_type_name")
    private String rentalTypeName;

    @OneToMany(mappedBy = "rentalType")
    @JsonIgnore
    private List<Reservation> reservations;

}
