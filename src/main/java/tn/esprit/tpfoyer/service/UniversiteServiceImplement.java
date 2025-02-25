package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImplement implements IUniversiteService{

    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite) ;
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }
}
