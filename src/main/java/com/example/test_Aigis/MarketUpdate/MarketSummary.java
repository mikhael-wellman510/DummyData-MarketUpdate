package com.example.test_Aigis.MarketUpdate;


import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(toBuilder = true)
public class MarketSummary {
    private String tittle;
    private List<String>marketSummary;
    private List<String>marketSummaryAll;

}
