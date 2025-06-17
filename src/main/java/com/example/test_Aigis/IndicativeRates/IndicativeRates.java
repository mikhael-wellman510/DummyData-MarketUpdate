package com.example.test_Aigis.IndicativeRates;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class IndicativeRates {
    List<CrossRates> crossRates;
    List<InterestRates> interestRates;
    List<SpotRates> spotRates;
}
