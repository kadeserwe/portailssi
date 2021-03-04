package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.ItextPrixDistDao;
import sn.ssi.partail.model.TextPrixDistModel;

import java.util.List;

@RestController
public class TextPrixDistController {
   @Autowired
   private ItextPrixDistDao textPrixDistDao;

    //Récupérer tous les produits
   @GetMapping(value="textprixdist")
   public List<TextPrixDistModel> listeTextPrixDist(){

       return textPrixDistDao.findAll();
   }

   //Récupérer un TextPrixDist par son Id
   @GetMapping(value="/textprixdist/{id}")
   public TextPrixDistModel recupererTextPrixDistId(@PathVariable int id) {
      return textPrixDistDao.findById(id);
   }
   //ajouter un TextPrixDist
   @PostMapping(value = "/textprixdist")
   public void ajouterTextPrixDist(@RequestBody TextPrixDistModel textprixdist) {
       textPrixDistDao.save(textprixdist);
    }

   /*modifier un TextPrixDist*/
   @PutMapping(value = "/textprixdist")
   public void modifierTextPrixDist(@RequestBody TextPrixDistModel textprixdist) {

       textPrixDistDao.save(textprixdist);
   }

  /* supprimer un TextPrixDist*/
   @DeleteMapping(value="/textprixdist/{id}")
   public void supprimerTextPrixDist(@PathVariable int id) {
     if(id!=0){
        try {
            TextPrixDistModel textprixdist= textPrixDistDao.findById(id);
            textprixdist.setIsDeleted(1);
            textPrixDistDao.save(textprixdist);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
