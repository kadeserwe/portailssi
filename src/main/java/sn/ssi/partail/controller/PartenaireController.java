package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IpartenaireDao;
import sn.ssi.partail.model.PartenaireModel;

import java.util.List;

@RestController
public class PartenaireController {
   @Autowired
   private IpartenaireDao partenaireDao;

    //Récupérer tous les Partenaires
   @GetMapping(value="partenaire")
   public List<PartenaireModel> listePartenaires(){

       return partenaireDao.findAll();
   }

   //Récupérer un Partenaire par son Id
   @GetMapping(value="/partenaire/{id}")
   public PartenaireModel recupererPartenairetId(@PathVariable int id) {
      return partenaireDao.findById(id);
   }

   //ajouter un Partenaire
   @PostMapping(value = "/partenaire")
   public void ajouterPartenaire(@RequestBody PartenaireModel partenaireModel) {
       partenaireDao.save(partenaireModel);
    }

   /*modifier un Partenaire*/
   @PutMapping(value = "/partenaire")
   public void modifierPartenaire(@RequestBody PartenaireModel partenaireModel) {

       partenaireDao.save(partenaireModel);
   }

  /* supprimer un Partenaire*/
   @DeleteMapping(value="/partenaire/{id}")
   public void supprimerPartenaire(@PathVariable int id) {
     if(id!=0){
        try {
            PartenaireModel partenaireModel = partenaireDao.findById(id);
            partenaireModel.setIsDeleted(1);
            partenaireDao.save(partenaireModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
