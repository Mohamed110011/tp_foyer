package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImplement implements IChambreService{
@Autowired
    private ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public List<Chambre> reterieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre reterieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }
}
