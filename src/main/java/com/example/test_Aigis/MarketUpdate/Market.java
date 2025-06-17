package com.example.test_Aigis.MarketUpdate;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Market {
    private MarketSummary marketSummary;
    private DomesticNewsUpdate domesticNewsUpdate;
    private GlobalNewUpdates globalNewUpdates;
    private FixedIncome fixedIncome;
}
