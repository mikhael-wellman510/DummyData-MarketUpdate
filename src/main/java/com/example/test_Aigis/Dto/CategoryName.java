package com.example.test_Aigis.Dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CategoryName {
    private Integer id;
    private String category;
    private String categoryId;
}
