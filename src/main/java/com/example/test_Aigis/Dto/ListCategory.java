package com.example.test_Aigis.Dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ListCategory {
    private Integer id ;
    private List<Category>categories;
}
