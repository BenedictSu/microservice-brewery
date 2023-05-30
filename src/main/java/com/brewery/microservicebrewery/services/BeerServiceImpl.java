package com.brewery.microservicebrewery.services;

import com.brewery.microservicebrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
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

    @Override
    public void updateBeer(UUID beerUuid, BeerDto beerDto) {
        // TODO
    }

    @Override
    public void deleteByUuid(UUID beerUuid) {
        log.debug("deleting beer: {}", beerUuid);
    }

}
