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
public class ChatTo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idChat;
    private String contenu;
    @Temporal(TemporalType.DATE)
    private Date dateMessage;

    @ManyToOne
    Candidat candidat;

}
