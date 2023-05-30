package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerByUuid(UUID customerUuid);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerUuid, CustomerDto customerDto);

    void deleteByUuid(UUID customerUuid);
}
