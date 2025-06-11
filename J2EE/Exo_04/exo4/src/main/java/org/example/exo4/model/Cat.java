package org.example.exo4.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Cat {
    private int id;
    private String catName;
    private String raceName;
    private String favoriteFood;
    private LocalDate birthDate;

}