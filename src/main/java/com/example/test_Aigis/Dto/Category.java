package com.example.test_Aigis.Dto;


import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Category {
    private Integer id;
    private String tittle;
    private String dateTime;
    private String description;
    private String category;
    private String url;

}
