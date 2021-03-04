package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IcandidatureDao;
import sn.ssi.partail.model.CandidatureModel;

import java.util.List;

@RestController
public class CandidatureController {
   @Autowired
   private IcandidatureDao candidatureDao;

    //Récupérer tous les Candidature
   @GetMapping(value="candidature")
   public List<CandidatureModel> listeCandidatures(){

       return candidatureDao.findAll();
   }

   //Récupérer un Candidature par son Id
   @GetMapping(value="/candidature/{id}")
   public CandidatureModel recupererCandidatureId(@PathVariable int id) {
      return candidatureDao.findById(id);
   }
   //ajouter un Candidature
   @PostMapping("/candidature")
   public void ajouterCandidature(@RequestBody CandidatureModel candidatureModel) {
       candidatureDao.save(candidatureModel);
    }

   /*modifier un Candidature*/
   @PutMapping(value = "/candidature")
   public void modifierCandidature(@RequestBody CandidatureModel candidatureModel) {
       candidatureDao.save(candidatureModel);
   }

  /* supprimer un Candidature*/
   @DeleteMapping(value="/candidature/{id}")
   public void supprimerCandidature(@PathVariable int id) {
     if(id!=0){
        try {
            CandidatureModel candidatureModel = candidatureDao.findById(id);
            candidatureModel.setIsDeleted(1);
            candidatureDao.save(candidatureModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
