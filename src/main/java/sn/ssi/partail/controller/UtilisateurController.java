package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IutilisateurDao;
import sn.ssi.partail.model.UtilisateurModel;

import java.util.List;

@RestController
public class UtilisateurController {
   @Autowired
   private IutilisateurDao utilisateurDao;

    //Récupérer tous les Utilisateur
   @GetMapping(value="utilisateur")
   public List<UtilisateurModel> listeUtilisateurs(){

       return utilisateurDao.findAll();
   }

   //Récupérer un Utilisateur par son Id
   @GetMapping(value="/utilisateur/{id}")
   public UtilisateurModel recupererUtilisateurId(@PathVariable int id) {
      return utilisateurDao.findById(id);
   }
   //ajouter un Utilisateur
   @PostMapping(value = "/utilisateur")
   public void ajouterUtilisateur(@RequestBody UtilisateurModel utilisateurModel) {
       utilisateurDao.save(utilisateurModel);
    }

   /*modifier un Utilisateur*/
   @PutMapping(value = "/utilisateur")
   public void modifierService(@RequestBody UtilisateurModel utilisateurModel)
   {
       utilisateurDao.save(utilisateurModel);
   }

  /* supprimer un Utilisateur*/
   @DeleteMapping(value="/utilisateur/{id}")
   public void supprimerUtilisateur(@PathVariable int id) {
     if(id!=0){
        try {
            UtilisateurModel utilisateurModel = utilisateurDao.findById(id);
            utilisateurModel.setIsDeleted(1);
            utilisateurDao.save(utilisateurModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
