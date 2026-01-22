package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygContratsDao;
import sn.ssi.togo.model.SygContrats;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygContratsController {

   @Autowired private ISygContratsDao sygContratsDao;
    

    //Récupérer tous les SygContrats
   @GetMapping(value="contrats")
   public List<SygContrats> listeSygContrats(){

       return sygContratsDao.findAll();
   }

   //Récupérer un SygContrats par son Id
   @GetMapping("/contrats/{id}")
   public Optional <SygContrats> recupererSygContratsId(@PathVariable Long id) {
       Optional <SygContrats> contrats = sygContratsDao.findById(id);
       return contrats;
   }




    //ajouter un Contrat
   @PostMapping("/contrats")
   public void ajoutercontrats(@RequestBody SygContrats SygContrats) {

       sygContratsDao.save(SygContrats);
    }

   /*modifier un SygContrats*/
   @PutMapping( "/contrats")
   public void modifierSygContrats(@Valid @RequestBody SygContrats SygContrats) {

       sygContratsDao.save(SygContrats);
   }




}
