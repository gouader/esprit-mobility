package tn.esprit.mobiliteinternationall.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceUniversite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idService;
    private String nomService;
    @Enumerated(EnumType.STRING)
    private TypeService typeService;
    private float priceService;
    private String adresse;
    private int disponibilite;
    private int rating;

    @ManyToOne
    Universite universite;

    @ManyToOne
    Candidat candidat;



}
