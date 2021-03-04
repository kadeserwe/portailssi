package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IevenementDao;
import sn.ssi.partail.model.EvenementModel;

import java.util.List;

@RestController
public class EvenementController {
   @Autowired
   private IevenementDao evenementDao;

    //Récupérer tous les evenements
   @GetMapping(value="evenement")
   public List<EvenementModel> listeEvenements(){

       return evenementDao.findAll();
   }

   //Récupérer un evenement par son Id
   @GetMapping(value="/evenement/{id}")
   public EvenementModel recupererEvenementId(@PathVariable int id) {
      return evenementDao.findById(id);
   }
   //ajouter un evenement
   @PostMapping(value = "/evenement")
   public void ajouterEvenement(@RequestBody EvenementModel evenementModel) {
       evenementDao.save(evenementModel);
    }

   /*modifier un evenement*/
   @PutMapping(value = "/evenement")
   public void modifierEvenement(@RequestBody EvenementModel evenementModel) {

       evenementDao.save(evenementModel);
   }

  /* supprimer un evenement*/
   @DeleteMapping(value="/evenement/{id}")
   public void supprimerEvenement(@PathVariable int id) {
     if(id!=0){
        try {
            EvenementModel evenementModel = evenementDao.findById(id);
            evenementModel.setIsDeleted(1);
            evenementDao.save(evenementModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
