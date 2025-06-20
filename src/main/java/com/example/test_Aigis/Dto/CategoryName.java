package com.example.test_Aigis.Dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CategoryName {
    private String id;
    private String category;
}
