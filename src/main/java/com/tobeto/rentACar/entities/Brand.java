package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Table(name="brands")
@Data
public class Brand
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "brand_name")
    private String brandName;

    @OneToMany(mappedBy = "brand") // variable name
    @JsonIgnore
    private List<Vehicle> vehicles;
}
