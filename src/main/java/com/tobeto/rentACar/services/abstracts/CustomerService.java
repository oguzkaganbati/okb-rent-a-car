package com.tobeto.rentACar.services.abstracts;


import com.tobeto.rentACar.entities.Customer;
import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse;

import java.util.List;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void delete(DeleteCustomerRequest deleteCustomerRequest);
    void update(UpdateCustomerRequest updateCustomerRequest);

    List<Customer> getCustomerByFirstName(String firstName);
    List<GetListCustomerResponse> getByCustomerFirstNameDto(String firstName);

    List<GetListValidLicenceCostumerResponse> getByValidLicenceDto(Boolean hasValidLicence);
}
