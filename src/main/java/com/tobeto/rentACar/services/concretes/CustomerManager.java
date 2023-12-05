package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Customer;
import com.tobeto.rentACar.repositories.CustomerRepository;
import com.tobeto.rentACar.services.abstracts.CustomerService;
import com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.rentACar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCustomerRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirst_name());
        customer.setLastName(request.getLast_name());
        customer.setHasValidLicence(request.getIsValidLicence());
        customer.setBirthDate(request.getBirth_date());

        customerRepository.save(customer);

    }

    @Override
    public void delete(DeleteCustomerRequest deleteCustomerRequest) {
        Customer customerToDelete = customerRepository.findById(deleteCustomerRequest.getCustomerId()).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest) {
        Customer customerToUpdate = customerRepository.findById(updateCustomerRequest.getCustomerId()).orElseThrow();
        customerToUpdate.setBirthDate(updateCustomerRequest.getCustomerBirthDate());
        customerToUpdate.setHasValidLicence(updateCustomerRequest.getCustomerHasValidLicence());
        customerToUpdate.setFirstName(updateCustomerRequest.getCustomerFirstName());
        customerToUpdate.setLastName(updateCustomerRequest.getCustomerLastName());

        customerRepository.saveAndFlush(customerToUpdate);
    }

    @Override
    public List<Customer> getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstNameStartingWith(firstName);
    }

    @Override
    public List<GetListCustomerResponse> getByCustomerFirstNameDto(String firstName) {
        return customerRepository.findByFirstNameStartingWith(firstName).stream().map(customer -> {
            return new GetListCustomerResponse(customer.getFirstName(), customer.getLastName(), customer.getHasValidLicence());
        }).toList();
    }

    @Override
    public List<GetListValidLicenceCostumerResponse> getByValidLicenceDto(Boolean hasValidLicence) {
        return customerRepository.findByValidLicence(hasValidLicence);
    }


}
