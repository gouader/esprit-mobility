package tn.esprit.mobiliteinternationall.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idCandidat;
    private int cin;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    @Enumerated(EnumType.STRING)
    private RoleCandidat roleCandidat;
    private String photo;


    @OneToMany(mappedBy = "candidat")
    List<Candidature> candidatures;

   // @OneToMany(mappedBy = "candidat")
  //  List<ServiceUniversite> serviceList;

    @OneToMany(mappedBy = "candidat")
    List<Reclamation> reclamations;

  //  @OneToMany(mappedBy = "candidat")
 //  List<Commentaire> commentaires;

    @OneToMany(mappedBy = "candidat")
    List<Chat> chats;

    @OneToMany(mappedBy = "candidat")
    List<ChatTo> emetteur;

    @OneToMany(mappedBy = "candidat")
    List<ChatTo> recepteur;

    @OneToMany(mappedBy = "candidat")
    List<Favori> favoris;



}
