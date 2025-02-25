package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.service.IUniversiteService;

@RestController
@RequestMapping
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }


    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }



    @DeleteMapping("/deleteUniversite/{idUniversite}")
    void deleteUniversite(@PathVariable int idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }


}
