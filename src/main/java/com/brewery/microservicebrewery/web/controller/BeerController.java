package com.brewery.microservicebrewery.web.controller;

import com.brewery.microservicebrewery.services.BeerService;
import com.brewery.microservicebrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerUuid) {
        return new ResponseEntity<BeerDto>(beerService.getBeerByUuid(beerUuid), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpHeaders> createBeer(@RequestBody BeerDto beerDto) {
        BeerDto createdBeer = beerService.createBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        // TODO: add the hostname to the URL
        headers.add("Location", "/api/v1/beer" + createdBeer.getUuid().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> handleUpdate(@PathVariable("beerId") UUID beerUuid, @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerUuid, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
