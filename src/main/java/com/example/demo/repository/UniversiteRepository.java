package com.example.demo.repository;

import com.example.demo.model.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
