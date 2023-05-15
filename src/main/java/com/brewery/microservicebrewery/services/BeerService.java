package com.brewery.microservicebrewery.services;

import java.util.UUID;

import com.brewery.microservicebrewery.web.model.BeerDto;

public interface BeerService {

    BeerDto getBeerByUuid(UUID beerUuid);

}
