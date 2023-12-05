package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Customer;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse;
import com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
    List<Customer> findByFirstNameStartingWith(String firstName);

   /*@Query("SELECT new com.tobeto.rentACar.services.dtos.customer.responses.GetListCustomerResponse(c.firstName, c.lastName, c.hasValidLicence) " +
            "FROM Customer c WHERE c.firstName= :firstName")
    List<GetListCustomerResponse> findByFirstName(String firstName);

*/
    @Query("SELECT new com.tobeto.rentACar.services.dtos.customer.responses.GetListValidLicenceCostumerResponse(c.id, c.firstName, c.lastName) " +
            "FROM Customer c WHERE c.hasValidLicence = :hasValidLicence")
    List<GetListValidLicenceCostumerResponse> findByValidLicence(@Param("hasValidLicence") Boolean hasValidLicence);

}
