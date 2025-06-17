package com.example.test_Aigis.MarketUpdate;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class GlobalNewUpdates {
    private String tittle;
    private List<String>globalNewsUpdates;
}
