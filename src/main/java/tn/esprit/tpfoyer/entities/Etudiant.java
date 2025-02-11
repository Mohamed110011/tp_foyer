package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
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
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;

    String nomEt;
    String prenomEt;
    long cin;
    String ecole;
    Date dateNaissance;

    // Many-to-Many relationship with Reservation
    @ManyToMany(mappedBy = "etudiants")

    Set<Reservation> reservations= new HashSet<Reservation>();
}
