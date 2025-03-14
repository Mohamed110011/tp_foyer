package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);

    void deleteEtudiant(Long idEtudiant);

    List<Etudiant> getallEtudiants();
    Etudiant getEtudiantById(long idEtudiant);
}
