package com.example.test_Aigis.Dto;


import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MarketDto {
    private String tittle;
    private List<String> data;
    private List<String> allData;
}
