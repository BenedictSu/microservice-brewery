package com.brewery.microservicebrewery.services.v2;

import com.brewery.microservicebrewery.web.model.v2.BeerDtoV2;
import com.brewery.microservicebrewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerByUuid(UUID beerUuid) {
        return BeerDtoV2
                .builder()
                .uuid(UUID.randomUUID())
                .beerName("first beer")
                .beerStyle(BeerStyle.WHITE)
                .universalProductCode(123L)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2
                .builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerUuid, BeerDtoV2 beerDto) {
        // TODO
    }

    @Override
    public void deleteByUuid(UUID beerUuid) {
        log.debug("deleting beer: {}", beerUuid);
    }

}
