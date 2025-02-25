package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.service.IBlocService;

@RestController
@RequestMapping
public class BlocController {
@Autowired
IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }


    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }


    @DeleteMapping("/deleteBloc/{idBloc}")
    void deleteBloc(@PathVariable long idBloc) {
         blocService.deleteBloc(idBloc);
    }

}
