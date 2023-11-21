package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


// Repository, DAO, DAL
//Data Access Object
//Data Access Layer



//  ORM => Object Relation Mapping
@Table(name="vehicles")
@Entity
@Getter
@Setter
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    @Column(name = "price_per_month")
    private BigDecimal pricePerMonth;

    @Column(name = "mileage_limit")
    private BigDecimal mileageLimit;

    @Column(name = "deposit_fee")
    private BigDecimal depositFee;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;


    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    private Fuel fuel;


    @ManyToOne
    @JoinColumn(name = "mileage_limit_range_id")
    private MileageLimitRange mileageLimitRange;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id")
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "deposit_fee_range_id")
    private DepositFeeRange depositFeeRange;

    @ManyToOne
    @JoinColumn(name = "price_range_id")
    private PriceRange priceRange;


    @OneToMany(mappedBy = "vehicle")
    @JsonIgnore
    private List<Reservation> reservations;



}
