package tn.esprit.mobiliteinternationall.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idCommentaire;
    private String libelle;
    @Temporal(TemporalType.DATE)
    private Date dateCommentaire;
    private int rating;


    @ManyToOne
    Candidat candidat;
}
