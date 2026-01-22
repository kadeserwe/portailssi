package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//
import sn.ssi.togo.dao.ISygAppelsOffresDao;
import sn.ssi.togo.model.SygAppelsOffres;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygAppelsOffresController {

   @Autowired private ISygAppelsOffresDao sygAppelsOffresDao;


    //Récupérer tous les SygAppelsOffres
   @GetMapping(value="appelsoffres")
   public List<SygAppelsOffres> listeSygAppelsOffres(){

       return sygAppelsOffresDao.findAll();
   }

   //Récupérer un SygAppelsOffres par son Id
   @GetMapping("/appelsoffres/{id}")
   public Optional <SygAppelsOffres> recupererSygAppelsOffresId(@PathVariable Long id) {
       Optional <SygAppelsOffres> appelsoffres = sygAppelsOffresDao.findById(id);
       return appelsoffres;
   }

    @GetMapping("/appelsoffres/ref/{aporeference}")
    public List<SygAppelsOffres> recupererSygAppelsOffresReference(@PathVariable String aporeference) {
        List<SygAppelsOffres> appelsoffresRef = sygAppelsOffresDao.findByAporeferenceIgnoreCase(aporeference);
        return appelsoffresRef;
    }

   //ajouter un AppelsOffres
   @PostMapping("/appelsoffres")
   public void ajouterAppelsOffres(@RequestBody SygAppelsOffres sygAppelsOffres) {

       sygAppelsOffresDao.save(sygAppelsOffres);
    }

   /*modifier un SygAppelsOffres*/
   @PutMapping( "/appelsoffres")
   public void modifierSygAppelsOffres(@Valid @RequestBody SygAppelsOffres sygAppelsOffres) {

       sygAppelsOffresDao.save(sygAppelsOffres);
   }




}
