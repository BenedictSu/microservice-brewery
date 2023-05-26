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

}
