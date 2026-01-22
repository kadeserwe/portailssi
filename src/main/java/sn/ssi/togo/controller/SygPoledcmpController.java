package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygPoledcmpDao;
import sn.ssi.togo.model.SygPoledcmp;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SygPoledcmpController {
   @Autowired
   private ISygPoledcmpDao sygPoledcmpDao;

    //Récupérer tous les SygPoledcmp
   @GetMapping(value="sygpoledcmp")
   public List<SygPoledcmp> listeSygPoledcmp(){

       return sygPoledcmpDao.findAll();
   }

   //Récupérer un SygPoledcmp par son Id
   @GetMapping(value="/sygoledcmp/{id}")
   public SygPoledcmp recupererSygPoledcmpId(@PathVariable int id) {
      return sygPoledcmpDao.findById(id);
   }
   //ajouter un SygPoledcmp
   @PostMapping(value = "/sygpoledcmp")
   public void ajouterSygPoledcmp(@RequestBody SygPoledcmp sygPoledcmp) {
       sygPoledcmpDao.save(sygPoledcmp);
    }

   /*modifier un SygPoledcmp*/
   @PutMapping(value = "/sygpoledcmp")
   public void modifierSygPoledcmp(@Valid @RequestBody SygPoledcmp sygPoledcmp) {

       sygPoledcmpDao.save(sygPoledcmp);
   }

  /* supprimer un SygPoledcmp*/
   @DeleteMapping(value="/sygpoledcmp/{id}")
   public void supprimerSygPoledcmp(@PathVariable int id) {
     // Produit produit = produitDao.findById(id);
     if(id!=0){
        try {
            SygPoledcmp sygPoledcmp = sygPoledcmpDao.findById(id);

            sygPoledcmpDao.deleteById(id);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
