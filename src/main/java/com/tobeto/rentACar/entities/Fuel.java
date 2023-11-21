package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "fuels")
@Getter
@Setter
public class Fuel
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fuel_name")
    private String fuelName;

    @OneToMany(mappedBy = "fuel")
    @JsonIgnore
    private List<Vehicle> vehicles;
}
