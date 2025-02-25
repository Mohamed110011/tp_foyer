package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(long idUniversite);
    List<Universite> getAllUniversites();
    Universite getUniversiteById(long idUniversite);
}
