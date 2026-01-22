package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygPlansdePassationDao;
import sn.ssi.togo.model.SygPlansdepassation;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygPlansdePassationController {
   @Autowired
   private ISygPlansdePassationDao sygPlansdePassationDao;

    //Récupérer tous les SygPlansdePassation
    
   @GetMapping(value="plansdepassation")
   public List<SygPlansdepassation> listeSygPlansdePassation(){

       return sygPlansdePassationDao.findAll();
   }

   //Récupérer un SygPlansdePassation par son Id
    @GetMapping(value= "/plansdepassation/{id}")
   //@GetMapping(value="/: http://localhost:9088/api/banque/{id}")
   public Optional<SygPlansdepassation> recupererSygPlansdepassationId(@PathVariable Long id) {
      return sygPlansdePassationDao.findById(id);
   }

    //Récupérer un Sygpays par son Num Plan
    @GetMapping("/plansdepassation/numplan/{numPlan}")
    public List<SygPlansdepassation> recupererSygPlansdepassationNumplan(@PathVariable String numPlan) {
        List<SygPlansdepassation> plansdepassation = sygPlansdePassationDao.findByNumplanIgnoreCase(numPlan);
        return plansdepassation;
    }
   //ajouter un SygPlansdePassation
   @PostMapping(value = "/plansdepassation")
   public void ajouterSygPlansdepassation(@RequestBody SygPlansdepassation sygPlansdepassation) {
       sygPlansdePassationDao.save(sygPlansdepassation);
    }

   /*modifier un SygPlansdePassation*/
   @PutMapping(value = "/plansdepassation")
   public void modifierSygPlansdePassation(@Valid @RequestBody SygPlansdepassation sygPlansdepassation) {

       sygPlansdePassationDao.save(sygPlansdepassation);
   }

  /* supprimer un SygPlansdePassation*/
  /* @DeleteMapping(value="/plansdepassation/{id}")
   public void supprimerSygPlansdePassation(@PathVariable int id) {
     // Produit produit = produitDao.findById(id);
     if(id!=0){
        try {
            SygPlansdepassation sygPlansdepassation = sygPlansdePassationDao.findById(id);

            sygPlansdePassationDao.deleteById(id);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }*/


}
