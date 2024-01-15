package tn.esprit.mobiliteinternationall.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idOffre;
    private String titre;
    @Min(value = 0)
    private int nbrePlaceDispo;
    @Temporal(TemporalType.DATE)
    private Date dateFinOffre;
    @Enumerated(EnumType.STRING)
    private StatutOffre statutOffre;
    @Enumerated(EnumType.STRING)
    private TypeOffre typeOffre;
    private String description;

    @ManyToOne
    Universite universite;

    @OneToMany(mappedBy = "offre")
    List<Candidature> candidatureList;

    @OneToMany(mappedBy = "offre")
    List<Favori> favoris;
}
