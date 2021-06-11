package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IarticleDao;
import sn.ssi.partail.dao.IlivreBlancDao;
import sn.ssi.partail.model.ArticleModel;
import sn.ssi.partail.model.LivreBlancModel;
import sn.ssi.partail.model.ProduitModel;

import java.util.List;

@RestController
public class LivreBlancController {
   @Autowired
   private IlivreBlancDao livreblancDao;

    //Récupérer tous les livreblancs
   @GetMapping(value="livreblanc")
   public List<LivreBlancModel> listeLivreblancs(){

       return livreblancDao.findAll();
   }

   //Récupérer un livreblanc par son Id
   @GetMapping(value="/livreblanc/{id}")
   public LivreBlancModel recupererLivreblancId(@PathVariable int id) {
      return livreblancDao.findById(id);
   }
   //ajouter un livreBlanc
   @PostMapping(value = "/livreblanc")
   public void ajouterlivreblanct(@RequestBody LivreBlancModel livreBlancModel) {
       livreblancDao.save(livreBlancModel);
   }

    /*modifier un livreBlanc*/
   @PutMapping(value = "/livreblanc")
   public void modifierLivreblanc(@RequestBody LivreBlancModel livreBlancModel) {
       livreblancDao.save(livreBlancModel);
   }

  /* supprimer un livreBlanc*/
   @DeleteMapping(value="/livreblanc/{id}")
   public void supprimerLivreblanc(@PathVariable int id) {
     if(id!=0){
        try {
            LivreBlancModel livreBlancModel = livreblancDao.findById(id);
            livreBlancModel.setIsDeleted(1);
            livreblancDao.save(livreBlancModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
