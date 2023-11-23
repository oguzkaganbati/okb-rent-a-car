package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "models")
@Getter
@Setter
public class Model
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "model_name")
    private String modelName;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<Vehicle> vehicles;
}
