
package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygPaysDao;
import sn.ssi.togo.dao.ISygPaysDao;
import sn.ssi.togo.model.SygPays;
import sn.ssi.togo.model.SygPays;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygPaysController {
   @Autowired
   private ISygPaysDao sygPaysDao;

    //Récupérer tous les Sygpays
   @GetMapping(value="pays")
   public List<SygPays> listeSygPays(){

       return sygPaysDao.findAll();
   }

   //Récupérer un Sygpays par son Id
   @GetMapping(value= "/pays/{id}")
   public Optional  <SygPays> recupererSygPaysId(@PathVariable Long id) {
       Optional  <SygPays>  pays = sygPaysDao.findById(id);
       return pays;
   }

    //Récupérer un Sygpays par son codePays
    @GetMapping("/pays/code/{codePays}")
    public List<SygPays> recupererSygPaysReference(@PathVariable String codePays) {
        List<SygPays> paysRef = sygPaysDao.findByCodepaysIgnoreCase(codePays);
        return paysRef;
    }
   //ajouter un pays
   @PostMapping(value = "/pays")
   public void ajouterSygPays(@RequestBody SygPays sygpays) {

       sygPaysDao.save(sygpays);
    }


/*modifier un Sygpays*/

   @PutMapping(value = "/pays")
   public void modifierSygpays(@Valid @RequestBody SygPays sygpays) {

       sygPaysDao.save(sygpays);
   }




}

