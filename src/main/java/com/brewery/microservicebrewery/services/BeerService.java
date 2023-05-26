package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerByUuid(UUID beerUuid);

    BeerDto createBeer(BeerDto beerDto);
}
