package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IproduitDao;
import sn.ssi.partail.model.Produit;

import java.util.List;

@RestController
public class ProduitController {
   @Autowired
   private IproduitDao produitDao;

    //Récupérer tous les produits
   @GetMapping(value="produits")
   public List<Produit> listeProduits(){

       return produitDao.findAll();
   }

   //Récupérer un produit par son Id
   @GetMapping(value="/produits/{id}")
   public Produit recupererProduitId(@PathVariable int id) {
      return produitDao.findById(id);
   }
   //ajouter un produit
   @PostMapping(value = "/produits")
   public void ajouterProduit(@RequestBody Produit produit) {
       produitDao.save(produit);
    }

   /*modifier un produit*/
   @PutMapping(value = "/produits")
   public void modifierProduit(@RequestBody Produit produit) {
      produitDao.save(produit);
   }

  /* supprimer un produit*/
   @DeleteMapping(value="/produits/{id}")
   public void supprimerProduit(@PathVariable int id) {
     // Produit produit = produitDao.findById(id);
     if(id!=0){
        try {
           Produit produit= produitDao.findById(id);
           produit.setIsDeleted(1);
           produitDao.save(produit);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
