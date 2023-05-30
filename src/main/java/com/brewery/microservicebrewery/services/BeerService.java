package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.BeerDto;

import java.util.UUID;

@Deprecated
public interface BeerService {

    BeerDto getBeerByUuid(UUID beerUuid);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(UUID beerUuid, BeerDto beerDto);

    void deleteByUuid(UUID beerUuid);
}
