package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygFournisseurDao;
import sn.ssi.togo.dao.ISygTypeAutoriteContractanteDao;
import sn.ssi.togo.model.SygFournisseur;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SygFournisseurController {
   @Autowired
   private ISygFournisseurDao sygFournisseurDao;

    //Récupérer tous les SygFournisseur
   @GetMapping(value="fournisseur")
   public List<SygFournisseur> listeSygFournisseur(){

       return sygFournisseurDao.findAll();
   }

   //Récupérer un SygFournisseur par son Id
   @GetMapping(value= "/fournisseur/{id}")
   public SygFournisseur recupererSygFournisseurId(@PathVariable Long id) { return sygFournisseurDao.findById(id);
   }
   //ajouter un SygFournisseur
   @PostMapping(value = "/fournisseur")
   public void ajouterSygFournisseur(@RequestBody SygFournisseur sygFournisseur) {

       sygFournisseurDao.save(sygFournisseur);
    }

   /*modifier un SygFournisseur*/
   @PutMapping(value = "/fournisseur")
   public void modifierSygFournisseur(@Valid @RequestBody SygFournisseur sygFournisseur) {

       sygFournisseurDao.save(sygFournisseur);
   }




}
