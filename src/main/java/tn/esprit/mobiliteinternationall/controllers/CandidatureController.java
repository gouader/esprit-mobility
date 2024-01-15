package tn.esprit.mobiliteinternationall.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.mobiliteinternationall.repositories.CandidatureRepository;


import java.io.IOException;

@RestController
@RequestMapping("/candidature")
public class CandidatureController {
    @Autowired
    CandidatureRepository candidatureRepository;


  /*  @PostMapping
    public Candidature ajouterCandidature(@RequestBody Candidature candidature) {
        candidature.setStatut(Statut.EnCoursDeTraitement);

        return candidatureRepository.save(candidature);

    }*/








}