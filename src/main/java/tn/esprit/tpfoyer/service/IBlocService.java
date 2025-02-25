package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(long idBloc);
    List<Bloc> getAllBlocs();
    Bloc getBlocById(long id);
}
