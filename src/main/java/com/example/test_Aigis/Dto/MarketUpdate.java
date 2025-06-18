package com.example.test_Aigis.Dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MarketUpdate {
    //d
    private String urlPdf;
    private List<IndicativeRatesDto>indicativeRatesDto;
    private List<MarketDto> marketDto;
}
