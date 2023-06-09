package com.brewery.microservicebrewery.web.controller.v2;

import com.brewery.microservicebrewery.services.v2.BeerServiceV2;
import com.brewery.microservicebrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerUuid) {
        return new ResponseEntity<>(beerService.getBeerByUuid(beerUuid), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpHeaders> createBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 createdBeer = beerService.createBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        // TODO: add the hostname to the URL
        headers.add("Location", "/api/v1/beer" + createdBeer.getUuid().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> handleUpdate(@PathVariable("beerId") UUID beerUuid, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerUuid, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerUuid) {
        beerService.deleteByUuid(beerUuid);
    }
}
