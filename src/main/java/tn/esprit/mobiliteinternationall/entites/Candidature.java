package tn.esprit.mobiliteinternationall.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idCandidature;
    @Temporal(TemporalType.DATE)
    private Date debutMobilite;

    private String cv;

    private String lettreMotivation;

    private StatutCandidature statutCandidature;
    @Transient
    private String releveNote;
    @Transient
    private Float moyenne;
    @Transient
    private String attestationTravail;
    @Transient
    private int nbrAnneeTravail;

    @ManyToOne
    Candidat candidat;

    @ManyToOne
    Offre offre;

    @OneToMany(mappedBy = "candidature")
    List<Entretien> entretientList;


}
