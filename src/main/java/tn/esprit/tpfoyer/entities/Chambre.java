package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {

    @ManyToOne
    Bloc bloc;

    @OneToMany
    List<Reservation> reservations;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idChambre;
     long numeroChambre;
    @Enumerated(EnumType.STRING)
     TypeChambre typeChambre;

}
