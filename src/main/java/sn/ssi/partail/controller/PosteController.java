package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IposteDao;
import sn.ssi.partail.model.PosteModel;

import java.util.Date;
import java.util.List;

@RestController
public class PosteController {
   @Autowired
   private IposteDao posteDao;

    //Récupérer tous les Postes
   @GetMapping(value="poste")
   public List<PosteModel> listePostes(){
       return posteDao.findAll();
   }

   //Récupérer un Poste par son Id
   @GetMapping(value="/poste/{id}")
   public PosteModel recupererPosteId(@PathVariable int id) {
      return posteDao.findById(id);
   }
   //ajouter un Footer
   @PostMapping("/poste")
   public void ajouterPoste(@RequestBody PosteModel posteModel)
   {

     Date d = new Date();

       posteDao.save(posteModel);
    }

   /*modifier un Poste*/
   @PutMapping(value = "/poste")
   public void modifierPoste(@RequestBody PosteModel posteModel) {
       posteDao.save(posteModel);
   }

  /* supprimer un Poste*/
   @DeleteMapping(value="/poste/{id}")
   public void supprimerPoste(@PathVariable int id) {
     if(id!=0){
        try {
            PosteModel poste = posteDao.findById(id);
            poste.setIsDeleted(1);
            posteDao.save(poste);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
