package com.example.test_Aigis.MarketUpdate;

import com.example.test_Aigis.IndicativeRates.IndicativeRates;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class MarketUpdate {
    private IndicativeRates indicativeRates;
    private Market market;
}
