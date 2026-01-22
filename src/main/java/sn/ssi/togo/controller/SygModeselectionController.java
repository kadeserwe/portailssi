package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygModeselectionDao;
import sn.ssi.togo.model.SygModeselection;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygModeselectionController {
   @Autowired
   private ISygModeselectionDao sygModeselectionDao;

    //Récupérer tous les SygModeselection
   @GetMapping(value="modeselection")
   public List<SygModeselection> listeSygModeselection(){

       return sygModeselectionDao.findAll();
   }

   //Récupérer un SygModeselection par son Id
   @GetMapping(value= "/modeselection/{id}")
   public Optional<SygModeselection> recupererSygModeselectionId(@PathVariable Long id) {
       Optional<SygModeselection> modeselection=sygModeselectionDao.findById(id);
       return modeselection;
   }

    //Récupérer un SygModeselection par son code
    @GetMapping(value="/modeselection/code/{code}")
    public List<SygModeselection> recupererSygModeselectionCode(@PathVariable String code) {
        List<SygModeselection> modeselectioncode = sygModeselectionDao.findByCodeIgnoreCase(code);
        return modeselectioncode ;

    }
   //ajouter un SygModeselection
   @PostMapping(value = "/modeselection")
   public void ajouterSygModeselection(@RequestBody SygModeselection sygModeselection) {

       sygModeselectionDao.save(sygModeselection);
    }

   /*modifier un SygModeselection*/
   @PutMapping(value = "/modeselection")
   public void modifierSygModeselection(@Valid @RequestBody SygModeselection sygModeselection) {

       sygModeselectionDao.save(sygModeselection);
   }




}
