package com.example.demo.controllers;

import com.example.demo.IService.IEtudiantService;
import com.example.demo.model.Etudiant;
import com.example.demo.model.Foyer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;
@GetMapping("/getAllEtudiant")
public List<Etudiant> getAllEtudiant(){
    return etudiantService.retrieveAllEtudiants();
}
@PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
    return etudiantService.addEtudiant(e);
}
    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return etudiantService.updateEtudiant(e);
    }
    @DeleteMapping("/deleteEtudiant/{id}")
    public void deleteEtudiant(@PathVariable Long id){
        etudiantService.removeEtudiant(id);
    }

}
