package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IfooterDao;
import sn.ssi.partail.model.FooterModel;

import java.util.List;

@RestController
public class FooterController {
   @Autowired
   private IfooterDao footerDao;

    //Récupérer tous les Footers
   @GetMapping(value="footer")
   public List<FooterModel> listeFooters(){

       return footerDao.findAll();
   }

   //Récupérer un Footer par son Id
   @GetMapping(value="/footer/{id}")
   public FooterModel recupererFootereId(@PathVariable int id) {
      return footerDao.findById(id);
   }
   //ajouter un Footer
   @PostMapping("/footer")
   public void ajouterFooter(@RequestBody FooterModel footerModel) {
       footerDao.save(footerModel);
    }

   /*modifier un Footer*/
   @PutMapping(value = "/footer")
   public void modifierFooter(@RequestBody FooterModel footerModel) {
       footerDao.save(footerModel);
   }

  /* supprimer un footer*/
   @DeleteMapping(value="/footer/{id}")
   public void supprimerFooter(@PathVariable int id) {
     if(id!=0){
        try {
            FooterModel footerModel = footerDao.findById(id);
            footerModel.setIsDeleted(1);
            footerDao.save(footerModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
