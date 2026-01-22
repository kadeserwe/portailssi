package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygAttributionsDao;
import sn.ssi.togo.dao.ISygAvisAttributionDao;
import sn.ssi.togo.model.SygAttributions;
import sn.ssi.togo.model.SygAvisAttribution;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygAvisAttributionController {

   @Autowired private ISygAvisAttributionDao  sygAvisAttributionsDao;
    

    //Récupérer tous les SygAvisAttributions
   @GetMapping(value="avisattributions")
   public List<SygAvisAttribution> listeSygAvisAttributions(){

       return sygAvisAttributionsDao.findAll();
   }

   //Récupérer un SygavisAttributions par son Id
   @GetMapping("/avisattributions/{id}")
   public Optional <SygAvisAttribution> recupererSygAvisAttributionsId(@PathVariable Long id) {
       Optional <SygAvisAttribution> avisattributions = sygAvisAttributionsDao.findById(id);
       return avisattributions;
   }

    //Récupérer un SygAttributions par referenceAvisGeneral
    @GetMapping("/avisattributions/aref/{attriRef}")
    public List<SygAvisAttribution> recupererSygAvisAttriReference(@PathVariable String attriRef) {
        List<SygAvisAttribution> avisAttriRef = sygAvisAttributionsDao.findByAttriRefIgnoreCase(attriRef);
        return avisAttriRef;
    }


    //ajouter un attributions
   @PostMapping("/avisattributions")
   public void ajouterAvisAttri(@RequestBody SygAvisAttribution sygAvisAttributions) {

       sygAvisAttributionsDao.save(sygAvisAttributions);
    }

   /*modifier un SygAttributions*/
   @PutMapping( "/avisattributions")
   public void modifierSygAvisAttri(@Valid @RequestBody SygAvisAttribution sygAvisAttributions) {

       sygAvisAttributionsDao.save(sygAvisAttributions);
   }




}
