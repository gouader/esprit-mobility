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
public class Reclamation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idReclamation;
    private String contenu;
    @Temporal(TemporalType.DATE)
    private Date dateReclamation;
    private TypeReclamation typeReclamation;
    private StatutReclamation statutReclamation;

    @ManyToOne
    Candidat candidat;

	public StatutReclamation getStatutReclamation() {
		return statutReclamation;
	}

	public void setStatutReclamation(StatutReclamation statutReclamation) {
		this.statutReclamation = statutReclamation;
	}

    
}
