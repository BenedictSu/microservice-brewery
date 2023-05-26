package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

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

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto
                .builder()
                .uuid(UUID.randomUUID())
                .build();
    }

}
