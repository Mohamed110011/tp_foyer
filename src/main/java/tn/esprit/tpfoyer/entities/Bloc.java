package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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

public class Bloc {

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set<Chambre> chambres= new HashSet<Chambre>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;
    String nomBloc ;
    long capaciteBloc ;
}
