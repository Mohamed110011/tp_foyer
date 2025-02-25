package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    String idReservation; // Changed from String to Long to match database constraints

    Date anneelUniversitaire;
    boolean estValide;

    // Many-to-Many (mappedBy references the `reservations` field in Etudiant)
    @ManyToMany
    Set<Etudiant> etudiants = new HashSet<Etudiant>();


    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneelUniversitaire() {
        return anneelUniversitaire;
    }

    public void setAnneelUniversitaire(Date anneelUniversitaire) {
        this.anneelUniversitaire = anneelUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
