package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idBloc;
private String nomBloc;
private long capaciteBloc;

}
