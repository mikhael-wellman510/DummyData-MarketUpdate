package com.example.test_Aigis.Dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Data {
    //dd
    private String currencyPair;
    private String last;
    private String prevWk;
}
