package com.example.demo.repository;

import com.example.demo.model.Bloc;
import com.example.demo.model.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

}
