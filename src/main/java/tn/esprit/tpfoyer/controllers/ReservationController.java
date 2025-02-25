package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.service.IReservationService;
import tn.esprit.tpfoyer.service.IUniversiteService;

@RestController
@RequestMapping
public class ReservationController {
    @Autowired
    IReservationService reservationService;
    @PostMapping("/addReservation")

    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }


    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }


    @DeleteMapping("/deleteReservation/{idReservation}")
    void deleteReservation(@PathVariable String idReservation) {
        reservationService.deleteReservation(idReservation);

    }

}
