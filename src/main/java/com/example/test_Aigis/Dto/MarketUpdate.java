package com.example.test_Aigis.Dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MarketUpdate {
    List<IndicativeRatesDto>indicativeRatesDtos;
    List<MarketDto> marketDto;
}
