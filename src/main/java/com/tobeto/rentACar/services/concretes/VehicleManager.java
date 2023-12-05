package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.*;
import com.tobeto.rentACar.repositories.VehicleRepository;
import com.tobeto.rentACar.services.abstracts.*;
import com.tobeto.rentACar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class VehicleManager implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final BrandService brandService;
    private final ModelService modelService;
    private final FuelService fuelService;
    private final TransmissionService transmissionService;
    private final VehicleTypeService vehicleTypeService;
    private final MileageLimitRangeService mileageLimitRangeService;
    private final DepositFeeRangeService depositFeeRangeService;
    private final PriceRangeService priceRangeService;

    @Override
    public void add(AddVehicleRequest addVehicleRequest) {
        if (vehicleRepository.existsCarByPlate(addVehicleRequest.getPlate())) {
            throw new RuntimeException("A vehicle with the provided plate already exists. Please choose a unique plate number.");
        }

    Vehicle vehicle = new Vehicle();
    vehicle.setPricePerDay(addVehicleRequest.getPricePerDay());
    vehicle.setPricePerMonth(addVehicleRequest.getPricePerMonth());
    vehicle.setMileageLimit(addVehicleRequest.getMileageLimit());
    vehicle.setDepositFee(addVehicleRequest.getDepositFee());
    vehicle.setPlate(addVehicleRequest.getPlate());
        Brand brand = brandService.getById(addVehicleRequest.getBrandId());
        vehicle.setBrand(brand);
        Model model = modelService.getById(addVehicleRequest.getModelId());
        vehicle.setModel(model);
        Fuel fuel = fuelService.getById(addVehicleRequest.getFuelTypeId());
        vehicle.setFuel(fuel);
        Transmission transmission = transmissionService.getById(addVehicleRequest.getTransmissionId());
        vehicle.setTransmission(transmission);
        VehicleType vehicleType = vehicleTypeService.getById(addVehicleRequest.getVehicleTypeId());
        vehicle.setVehicleType(vehicleType);
        MileageLimitRange mileageLimitRange = mileageLimitRangeService.getById(addVehicleRequest.getMileageLimitRangeId());
        vehicle.setMileageLimitRange(mileageLimitRange);
        DepositFeeRange depositFeeRange = depositFeeRangeService.getById(addVehicleRequest.getDepositFeeRangeId());
        vehicle.setDepositFeeRange(depositFeeRange);
        PriceRange priceRange = priceRangeService.getById(addVehicleRequest.getPriceRangeId());
        vehicle.setPriceRange(priceRange);

        vehicleRepository.save(vehicle);



    }

    @Override
    public List<GetVehicleListByFuelTypeResponse> getByFuelNameDto(String fuelName) {
        return vehicleRepository.findByFuelName(fuelName);
    }
}
