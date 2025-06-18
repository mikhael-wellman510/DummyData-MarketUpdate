package com.example.test_Aigis.Dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Item {
    private Integer id;
    private String tittle;
    private String dateTime;
    private String description;
}
