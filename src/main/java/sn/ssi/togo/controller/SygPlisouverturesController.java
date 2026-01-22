package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygPlisouverturesDao;;
import sn.ssi.togo.model.SygPlisouvertures;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygPlisouverturesController {

   @Autowired private ISygPlisouverturesDao sygPlisouverturesDao;
    

    //Récupérer tous les SygLots
   @GetMapping(value="plisouvertures")
   public List<SygPlisouvertures> listeSygPlisouvertures(){

       return sygPlisouverturesDao.findAll();
   }

   //Récupérer un Plisouvertures par son Id
   @GetMapping("/plisouvertures/{id}")
   public Optional <SygPlisouvertures> recupererSygPlisouverturesId(@PathVariable Long id) {
       Optional <SygPlisouvertures> plisouvertures = sygPlisouverturesDao.findById(id);
       return plisouvertures;
   }




    //ajouter un Plisouvertures
   @PostMapping("/plisouvertures")
   public void ajouterPlisouvertures(@RequestBody SygPlisouvertures SygPlisouvertures) {

       sygPlisouverturesDao.save(SygPlisouvertures);
    }

   /*modifier un Plisouvertures*/
   @PutMapping( "/plisouvertures")
   public void modifierSygPlisouvertures(@Valid @RequestBody SygPlisouvertures sygPlisouvertures) {

       sygPlisouverturesDao.save(sygPlisouvertures);
   }




}
