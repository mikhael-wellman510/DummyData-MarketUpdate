package com.example.test_Aigis.Dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Data {
    //d
    private String currencyPair;
    private String last;
    private String prevWk;
}
