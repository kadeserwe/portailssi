package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygAttributionsDao;
import sn.ssi.togo.dao.ISygAttributionsDao;
import sn.ssi.togo.model.SygAttributions;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygAttributionsController {

   @Autowired private ISygAttributionsDao sygAttributionsDao;
    

    //Récupérer tous les SygAttributions
   @GetMapping(value="attributions")
   public List<SygAttributions> listeSygAttributions(){

       return sygAttributionsDao.findAll();
   }

   //Récupérer un SygAttributions par son Id
   @GetMapping("/attributions/{id}")
   public Optional <SygAttributions> recupererSygAttributionsId(@PathVariable Long id) {
       Optional <SygAttributions> attributions = sygAttributionsDao.findById(id);
       return attributions;
   }

    //Récupérer un SygAttributions par referenceAvisGeneral
    @GetMapping("/attributions/refag/{referenceAvisGeneral}")
    public List<SygAttributions> recupererSygAttributionsReferenceAG(@PathVariable String referenceAvisGeneral) {
        List<SygAttributions> attributionsRefAG = sygAttributionsDao.findByReferenceAvisGeneralIgnoreCase(referenceAvisGeneral);
        return attributionsRefAG;
    }
    //Récupérer un SygAttributions par referencePlandePassation
    @GetMapping("/attributions/refpp/{referencePlandePassation}")
    public List<SygAttributions> recupererSygAttributionsReferencePP(@PathVariable String referencePlandePassation) {
        List<SygAttributions> attributionsRefPP = sygAttributionsDao.findByReferencePlandePassationIgnoreCase(referencePlandePassation);
        return attributionsRefPP;
    }


    //ajouter un attributions
   @PostMapping("/attributions")
   public void ajouterattributions(@RequestBody SygAttributions SygAttributions) {

       sygAttributionsDao.save(SygAttributions);
    }

   /*modifier un SygAttributions*/
   @PutMapping( "/attributions")
   public void modifierSygAttributions(@Valid @RequestBody SygAttributions SygAttributions) {

       sygAttributionsDao.save(SygAttributions);
   }




}
