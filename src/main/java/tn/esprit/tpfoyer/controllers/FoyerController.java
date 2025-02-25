package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

@RestController
@RequestMapping
public class FoyerController {
    @Autowired
    IFoyerService foyerService;
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }


    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }


    @DeleteMapping("/deleteFoyer/{idFoyer}")
    void deleteFoyer(@PathVariable int idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }

}
