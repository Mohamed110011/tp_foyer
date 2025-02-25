package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String idReservation);
    List<Reservation> getAllReservations();
    Reservation getReservation(String idReservation);


}
