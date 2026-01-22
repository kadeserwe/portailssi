package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygMonnaieoffreDao;
import sn.ssi.togo.model.SygModeselection;
import sn.ssi.togo.model.SygMonnaieoffre;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygMonnaieoffreController {
   @Autowired
   private ISygMonnaieoffreDao sygMonnaieoffreDao;

    //Récupérer tous les SygMonnaieoffres
   @GetMapping(value="monnaieoffre")
   public List<SygMonnaieoffre> listeSygMonnaieoffres(){

       return sygMonnaieoffreDao.findAll();
   }

   //Récupérer un SygMonnaieoffre par son Id
   @GetMapping(value= "/monnaieoffre/{id}")
   public Optional  <SygMonnaieoffre> recupererSygMonnaieoffreId(@PathVariable Long id) {
       Optional  <SygMonnaieoffre>  monnaieoffre = sygMonnaieoffreDao.findById(id);
       return monnaieoffre ;
   }
    //Récupérer un SygModeselection par son Moncode
    @GetMapping(value="/monnaieoffre/moncode/{monCode}")
    public List<SygMonnaieoffre> recupererSygMonnaieoffreMonCode(@PathVariable String monCode) {
        List<SygMonnaieoffre> monnaieoffreMoncode = sygMonnaieoffreDao.findByMonCodeIgnoreCase(monCode);
        return monnaieoffreMoncode ;

    }
   //ajouter un Monnaieoffre
   @PostMapping(value = "/monnaieoffre")
   public void ajouterSygMonnaieoffre(@RequestBody SygMonnaieoffre sygMonnaieoffre) {

       sygMonnaieoffreDao.save(sygMonnaieoffre);
    }

   /*modifier un SygMonnaieoffre*/
   @PutMapping(value = "/monnaieoffre")
   public void modifierSygMonnaieoffre(@Valid @RequestBody SygMonnaieoffre sygMonnaieoffre) {

       sygMonnaieoffreDao.save(sygMonnaieoffre);
   }




}
