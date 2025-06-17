package com.example.test_Aigis.MarketUpdate;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class DomesticNewsUpdate {
    private String tittle;
    private List<String>domesticNewsUpdate;
}
