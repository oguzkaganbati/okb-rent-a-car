package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.CustomerService;
import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/customers")
public class CustomersControllers {

    private CustomerService customerService;

    public CustomersControllers(CustomerService customerService) {
        this.customerService = customerService;
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
