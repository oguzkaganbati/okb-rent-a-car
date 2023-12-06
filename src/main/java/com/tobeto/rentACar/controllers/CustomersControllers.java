package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.entities.Customer;
import com.tobeto.rentACar.services.abstracts.CustomerService;
import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomersControllers {

    private CustomerService customerService;

    public CustomersControllers(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomerByFirstName(@RequestParam @Valid String firstName) {
        return customerService.getCustomerByFirstName(firstName);
    }

    // Uncomment the @Valid annotation if needed
    @GetMapping("/dto/byFirstName")
    List<GetListCustomerResponse> getByCustomerFirstNameDto(@RequestParam /*@Valid*/ String firstName) {
        return customerService.getByCustomerFirstNameDto(firstName);
    }

    // Uncomment the @Valid annotation if needed
    @GetMapping("/dto/byValidLicence")
    List<GetListValidLicenceCostumerResponse> getByValidLicenceDto(@RequestParam /*@Valid*/ Boolean hasValidLicence) {
        return customerService.getByValidLicenceDto(hasValidLicence);
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCustomerRequest addCustomerRequest) {
        customerService.add(addCustomerRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid DeleteCustomerRequest deleteCustomerRequest) {
        customerService.delete(deleteCustomerRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateCustomerRequest updateCustomerRequest) {
        customerService.update(updateCustomerRequest);
    }
}
