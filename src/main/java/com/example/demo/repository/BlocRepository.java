package com.example.demo.repository;

import com.example.demo.model.Bloc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
  Bloc findByNomBloc(String name);
}
