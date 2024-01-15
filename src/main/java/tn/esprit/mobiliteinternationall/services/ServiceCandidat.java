package tn.esprit.mobiliteinternationall.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.mobiliteinternationall.entites.Candidat;
import tn.esprit.mobiliteinternationall.repositories.CandidatRepository;

@Service
public class ServiceCandidat implements ICandidatService {

	@Autowired
	CandidatRepository candidatRepository  ;
	
	@Override
	public Candidat addCandidat(Candidat E) {
		return candidatRepository.save(E);
	}

	@Override
	public Candidat updateCandidat(Candidat E) {
		return candidatRepository.save(E);	}

	@Override
	public Candidat getCandidatId(Integer id) {
		return candidatRepository.findById(id).orElse(null);
	}

	@Override
	public List<Candidat> getAllCandidats() {
		
		return candidatRepository.findAll();
	}

	@Override
	public void removeCandidat(Integer id) {
		
		candidatRepository.deleteById(id);
	}

	
	
}
