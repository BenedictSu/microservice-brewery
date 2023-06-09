package com.brewery.microservicebrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Deprecated
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID   uuid;
    private String beerName;
    private String beerStyle;
    private Long   universalProductCode;
}