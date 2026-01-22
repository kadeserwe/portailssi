package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygContratsDao;
import sn.ssi.togo.dao.ISygLotsDao;
import sn.ssi.togo.model.SygContrats;
import sn.ssi.togo.model.SygLots;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygLotsController {

   @Autowired private ISygLotsDao sygLotsDao;
    

    //Récupérer tous les SygLots
   @GetMapping(value="lots")
   public List<SygLots> listeSygLots(){

       return sygLotsDao.findAll();
   }

   //Récupérer un Lots par son Id
   @GetMapping("/lots/{id}")
   public Optional <SygLots> recupererSygLotsId(@PathVariable Long id) {
       Optional <SygLots> lots = sygLotsDao.findById(id);
       return lots;
   }




    //ajouter un Lots
   @PostMapping("/lots")
   public void ajouterLots(@RequestBody SygLots SygLots) {

       sygLotsDao.save(SygLots);
    }

   /*modifier un SygLots*/
   @PutMapping( "/lots")
   public void modifierSygLots(@Valid @RequestBody SygLots sygLots) {

       sygLotsDao.save(sygLots);
   }




}
