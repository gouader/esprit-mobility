package tn.esprit.mobiliteinternationall.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mobiliteinternationall.entites.Offre;
import tn.esprit.mobiliteinternationall.entites.StatutOffre;
import tn.esprit.mobiliteinternationall.entites.Universite;
import tn.esprit.mobiliteinternationall.repositories.UniversiteRepository;
import tn.esprit.mobiliteinternationall.services.IServiceOffre;

import java.util.List;

@RestController
@RequestMapping("/offre")
@AllArgsConstructor
public class OffreController {
    private IServiceOffre iServiceOffre;

    @PostMapping("/add")
    public Offre addOffre(@RequestBody Offre O) {
        O.setStatutOffre(StatutOffre.EnCours);
        return iServiceOffre.addOffre(O);
    }

   @PutMapping("/update")
    public Offre updateOffre(@RequestBody Offre O) {
        return iServiceOffre.updateOffre(O);
    }

    @GetMapping("/get/{idOffre}")
    public Offre getOffreId(@PathVariable Integer idOffre) {
        return iServiceOffre.getOffreId(idOffre);
    }

  @GetMapping("/getAll")
    public List<Offre> getAllOffre() {
        return iServiceOffre.getAllOffre();
    }

    @DeleteMapping("/delete/{idOffre}")
    public void removeOffre(Integer idOffre) {
        iServiceOffre.removeOffre(idOffre);

    }
    @PostMapping("add/{idUniveriste}")
    public void addOffreAndAssignUniversite(@RequestBody Offre O, @PathVariable int idUniveriste){
        iServiceOffre.addOffreAndAssignUniversite(O,idUniveriste);


    }

}
