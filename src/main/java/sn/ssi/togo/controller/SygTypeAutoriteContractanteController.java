package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygTypeAutoriteContractanteDao;
import sn.ssi.togo.model.SygModeselection;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygTypeAutoriteContractanteController {
   @Autowired
   private ISygTypeAutoriteContractanteDao sygTypeAutoriteContractanteDao;

    //Récupérer tous les typeautorites
   @GetMapping(value="typeautorite")
   public List<SygTypeAutoriteContractante> listeSygTypeAutoriteContractantes(){

       return sygTypeAutoriteContractanteDao.findAll();
   }

   //Récupérer un typeautorite par son Id
   @GetMapping(value="/typeautorite/{id}")
   public Optional<SygTypeAutoriteContractante> recupererSygTypeAutoriteContractanteId(@PathVariable Long id) {
      return sygTypeAutoriteContractanteDao.findById(id);
   }
    //Récupérer un typeautorite par son code
    @GetMapping(value="/typeautorite/code/{code}")
    public List<SygTypeAutoriteContractante> recupererSygModeselectionCode(@PathVariable String code) {
        List<SygTypeAutoriteContractante> typeAutoriteContractante = sygTypeAutoriteContractanteDao.findByCodeIgnoreCase(code);
        return typeAutoriteContractante ;

    }
   //ajouter un produit
   @PostMapping(value = "/typeautorite")
   public void ajouterSygTypeAutoriteContractante(@RequestBody SygTypeAutoriteContractante sygTypeAutoriteContractante) {
       sygTypeAutoriteContractanteDao.save(sygTypeAutoriteContractante);
    }

   /*modifier un typeautorite*/
   @PutMapping(value = "/typeautorite")
   public void modifierSygTypeAutoriteContractante(@Valid @RequestBody SygTypeAutoriteContractante sygTypeAutoriteContractante) {

       sygTypeAutoriteContractanteDao.save(sygTypeAutoriteContractante);
   }

  /* supprimer un SygTypeAutoriteContractante*/
   /*@DeleteMapping(value="/typeautorite/{id}")
   public void supprimerSygTypeAutoriteContractante(@PathVariable int id) {
     // Produit produit = produitDao.findById(id);
     if(id!=0){
        try {
            SygTypeAutoriteContractante sygTypeAutoriteContractante = sygTypeAutoriteContractanteDao.findById(id);
            //sygTypeAutoriteContractante.setIsDeleted(1);
           // sygTypeAutoriteContractanteDao.save(sygTypeAutoriteContractante);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }*/


}
