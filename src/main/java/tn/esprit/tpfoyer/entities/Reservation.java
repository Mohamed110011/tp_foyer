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
}
