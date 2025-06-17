package com.example.test_Aigis.MarketUpdate;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class FixedIncome {
    private String tittle;
    private List<String>fixedIncome;

}
