package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(long idFoyer);
    List<Foyer> getAllFoyers();
    Foyer getFoyerById(long idFoyer);
}
