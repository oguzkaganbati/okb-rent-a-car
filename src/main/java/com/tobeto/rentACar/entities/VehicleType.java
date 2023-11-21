package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "vehicle_types")
@Getter
@Setter
public class VehicleType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "vehicle_type_name")
    private String vehicleTypeName;

    @OneToMany(mappedBy = "vehicleType")
    @JsonIgnore
    private List<Vehicle> vehicles;


}
