package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IproduitDao;
import sn.ssi.partail.model.ProduitModel;

import java.util.List;

@RestController
public class ProduitController {
   @Autowired
   private IproduitDao produitDao;

    //Récupérer tous les produits
   @GetMapping(value="produits")
   public List<ProduitModel> listeProduits(){

       return produitDao.findAll();
   }

   //Récupérer un produit par son Id
   @GetMapping(value="/produits/{id}")
   public ProduitModel recupererProduitId(@PathVariable int id) {
      return produitDao.findById(id);
   }
   //ajouter un produit
   @PostMapping(value = "/produits")
   public void ajouterProduit(@RequestBody ProduitModel produitModel) {
       produitDao.save(produitModel);
    }

   /*modifier un produit*/
   @PutMapping(value = "/produits")
   public void modifierProduit(@RequestBody ProduitModel produitModel) {
       
      produitDao.save(produitModel);
   }

  /* supprimer un produit*/
   @DeleteMapping(value="/produits/{id}")
   public void supprimerProduit(@PathVariable int id) {
     // Produit produit = produitDao.findById(id);
     if(id!=0){
        try {
           ProduitModel produitModel = produitDao.findById(id);
           produitModel.setIsDeleted(1);
           produitDao.save(produitModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
