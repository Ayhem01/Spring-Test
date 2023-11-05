package com.example.demo.controllers;

import com.example.demo.IService.IEtudiantService;
import com.example.demo.IService.IFoyerService;
import com.example.demo.model.Etudiant;
import com.example.demo.model.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {
    IFoyerService foyerService;

    @GetMapping("/getAllFoyers")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return foyerService.updateFoyer(f);
    }
    @DeleteMapping("/deleteFoyer/{id}")
    public void deleteFoyer(@PathVariable Long id){
        foyerService.removeFoyer(id);
    }

}
