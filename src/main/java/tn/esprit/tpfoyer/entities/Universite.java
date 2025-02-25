package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;



@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Universite {
    @OneToOne
    Foyer foyer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUniversite ;
    String nomUniversite ;
    String adresse ;

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
