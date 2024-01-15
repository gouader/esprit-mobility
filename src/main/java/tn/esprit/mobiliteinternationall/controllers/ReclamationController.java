package tn.esprit.mobiliteinternationall.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mobiliteinternationall.entites.Reclamation;
import tn.esprit.mobiliteinternationall.services.ReclamationService;

@RestController
public class ReclamationController {
    @Autowired
    ReclamationService reclamationService;

    //http://localhost:9090/add-Reclamation
    @PostMapping("/add-Reclamation")
    @ResponseBody
    public Reclamation addReclamation (@RequestBody Reclamation r){

        reclamationService.addReclamation(r);
        return r;
    } 	
    
 // http://localhost:9090/retrieve-all-Reclamations
 	@GetMapping("/retrieve-all-Reclamations")
 	@ResponseBody
 	public List<Reclamation> getCReclamations() {
 		List<Reclamation> list = reclamationService.getallReclamations();
 		return list;
 	}

 	

 	// http://localhost:9090/remove-Reclamation/{idReclamation}
 	@DeleteMapping("/remove-Reclamation/{idReclamation}")
 	@ResponseBody
 	public void removeReclamation(@PathVariable("idReclamation") int idReclamation) {
 		reclamationService.deleteReclamation(idReclamation);
 	}
 	
 // http://localhost:9090/retrieve-Reclamation/{id}
 	@GetMapping("/retrieve-Reclamation/{id}")
 	@ResponseBody
 	public Reclamation retrieveReclamation(@PathVariable("id") int id) {
 		return reclamationService.retrieveReclamation(id);
 	}

 	// http://localhost:9090/modify-Reclamation/{idReclamation}
 	@PutMapping("/modify-Reclamation/{idReclamation}")
 	@ResponseBody
 	public Reclamation updateReclamation(@RequestBody Reclamation r) {
 		return reclamationService.updateReclamation(r);
 	}
}