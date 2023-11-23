package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void delete(DeleteCustomerRequest deleteCustomerRequest);
    void update(UpdateCustomerRequest updateCustomerRequest);
}
