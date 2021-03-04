package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IimageDao;
import sn.ssi.partail.model.ImageModel;

import java.util.List;

@RestController
public class ImageController {
   @Autowired
   private IimageDao imageDao;

    //Récupérer tous les Images
   @GetMapping(value="image")
   public List<ImageModel> listeImages(){

       return imageDao.findAll();
   }

   //Récupérer un Image par son Id
   @GetMapping(value="/image/{id}")
   public ImageModel recupererImageId(@PathVariable int id) {
      return imageDao.findById(id);
   }
   //ajouter un Image
   @PostMapping(value = "/image")
   public void ajouterImage(@RequestBody ImageModel image) {
       imageDao.save(image);
    }

   /*modifier un Image*/
   @PutMapping(value = "/image")
   public void modifierImage(@RequestBody ImageModel image)
   {
       imageDao.save(image);
   }

  /* supprimer un Image*/
   @DeleteMapping(value="/image/{id}")
   public void supprimerImage(@PathVariable int id) {
     if(id!=0){
        try {
            ImageModel image = imageDao.findById(id);
            image.setIsDeleted(1);
            imageDao.save(image);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
