package tn.esprit.tpfoyer.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

@RestController
@RequestMapping
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }


    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }


    @DeleteMapping("/deleteEtudaint/{idEtudiant}")
    void deleteEtudiant(@PathVariable long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }



}
