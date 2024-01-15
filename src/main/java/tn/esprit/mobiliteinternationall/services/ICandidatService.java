package tn.esprit.mobiliteinternationall.services;

import java.util.List;

import tn.esprit.mobiliteinternationall.entites.Candidat;
import tn.esprit.mobiliteinternationall.entites.Entretien;

public interface ICandidatService {

	public Candidat addCandidat (Candidat E) ;
    public Candidat updateCandidat(Candidat E) ;
    public Candidat getCandidatId (Integer id) ;
    public List<Candidat> getAllCandidats();
    public void removeCandidat (Integer id);
}
