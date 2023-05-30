package com.brewery.microservicebrewery.services.v2;

import com.brewery.microservicebrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerByUuid(UUID beerUuid);

    BeerDtoV2 createBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerUuid, BeerDtoV2 beerDto);

    void deleteByUuid(UUID beerUuid);
}
