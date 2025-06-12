package org.example.exercice_05.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dog {
   @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dogName;
    private String raceName;
    private LocalDate birthDate;

}