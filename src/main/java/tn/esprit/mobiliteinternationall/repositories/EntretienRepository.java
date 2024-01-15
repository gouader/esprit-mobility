package tn.esprit.mobiliteinternationall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.mobiliteinternationall.entites.Entretien;

public interface EntretienRepository extends JpaRepository<Entretien,Integer> {
     @Query (value = "SELECT COUNT(*) FROM entretien e , candidature c ,offre o\n" +
             " WHERE e.candidature_id_candidature=c.id_candidature \n" +
             " AND c.offre_id_offre=o.id_offre \n" +
             " AND offre_id_offre=:id AND e.statut_entretien=\"Accepte\"",nativeQuery = true)
     int nbrEntretienAccepte (@Param("id") int idoffre);


}
