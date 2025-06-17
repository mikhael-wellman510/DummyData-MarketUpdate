package com.example.test_Aigis.IndicativeRates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SpotRates {
    private String currencyPair;
    private String last;         // Nilai terakhir
    private String prev1Wk;      // Nilai 1 minggu sebelumnya
}
