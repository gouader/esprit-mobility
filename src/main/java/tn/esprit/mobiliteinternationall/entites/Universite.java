package tn.esprit.mobiliteinternationall.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idUniversite;
    private String nomUniversite;
    private String adresseUniversite;
    private String pays;
    private String specialite;
    @Enumerated(EnumType.STRING)
    private TypeUniversite typeUniversite;

  //  @OneToMany(mappedBy = "universite")
  //  List<Service> services;

    @OneToMany(mappedBy = "universite")
    List<Offre> offreList;

    @OneToMany(mappedBy = "universite")
    List<Entretien> entretienList;


}
