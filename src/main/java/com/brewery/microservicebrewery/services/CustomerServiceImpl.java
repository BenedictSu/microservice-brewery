package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerByUuid(UUID customerUuid) {
        return CustomerDto
                .builder()
                .uuid(UUID.randomUUID())
                .customerName("first customer")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto
                .builder()
                .uuid(UUID.randomUUID())
                .customerName(customerDto.getCustomerName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerUuid, CustomerDto customerDto) {
        // TODO
    }

    @Override
    public void deleteByUuid(UUID customerUuid) {
        // TODO
    }

}
