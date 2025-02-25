package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(long idChambre);
    List<Chambre> reterieveAllChambre();
    Chambre reterieveChambre(long idChambre);

}
