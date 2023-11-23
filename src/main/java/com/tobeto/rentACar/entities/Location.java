package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
public class Location
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "location_name")
    private String locationName;

    @OneToMany(mappedBy = "dropoffLocation")
    @JsonIgnore
    private List<Reservation> dropoffReservations;

    @OneToMany(mappedBy = "pickupLocation")
    @JsonIgnore
    private List<Reservation> pickupReservations;

}
