package tn.esprit.mobiliteinternationall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mobiliteinternationall.entites.Reclamation;
import tn.esprit.mobiliteinternationall.repositories.ReclamationRepository;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    ReclamationRepository recrepo;



    public Reclamation addReclamation(Reclamation r) {

        return recrepo.save(r);
    }

    public List<Reclamation> getallReclamations() {

        return (List<Reclamation>) recrepo.findAll();
    }



    public void deleteReclamation(int id) {
        recrepo.deleteById(id);

    }

    
	public Reclamation retrieveReclamation(int id) {
		// TODO Auto-generated method stub
		return recrepo.findById(id).orElse(null);
	}
    
	public Reclamation updateReclamation(Reclamation p) {
		// TODO Auto-generated method stub
		return recrepo.save(p);
	}
}
