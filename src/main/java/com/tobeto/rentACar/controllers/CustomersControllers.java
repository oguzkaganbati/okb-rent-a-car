package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.entities.Customer;
import com.tobeto.rentACar.services.abstracts.CustomerService;
import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse;
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
    List<Customer> getCustomerByFirstName(@RequestParam String firstName){
        return customerService.getCustomerByFirstName(firstName);
    }

    @GetMapping("/dto/byFirstName")
    List<GetListCustomerResponse> getByCustomerFirstNameDto(@RequestParam String firstName){
        return customerService.getByCustomerFirstNameDto(firstName);
    }

    @GetMapping("/dto/byValidLicence")
    List<GetListValidLicenceCostumerResponse> getByValidLicenceDto(@RequestParam Boolean hasValidLicence){
        return customerService.getByValidLicenceDto(hasValidLicence);
    }


    @PostMapping
    public void add(@RequestBody AddCustomerRequest addCustomerRequest){
        customerService.add(addCustomerRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteCustomerRequest deleteCustomerRequest){
        customerService.delete(deleteCustomerRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest){
        customerService.update(updateCustomerRequest);
    }
}
