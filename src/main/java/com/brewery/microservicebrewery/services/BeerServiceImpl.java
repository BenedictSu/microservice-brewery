package com.brewery.microservicebrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.brewery.microservicebrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerByUuid(UUID beerUuid) {
        return BeerDto
                .builder()
                .uuid(UUID.randomUUID())
                .beerName("first beer")
                .beerStyle("first style")
                .universalProductCode(123L)
                .build();
    }

}
