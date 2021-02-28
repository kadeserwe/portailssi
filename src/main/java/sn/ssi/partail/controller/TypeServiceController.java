package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.ItypeServiceDao;
import sn.ssi.partail.model.TypeService;

import java.util.List;

@RestController
public class TypeServiceController {
   @Autowired
   private ItypeServiceDao typeserviceDao;

    //Récupérer tous les type services
   @GetMapping(value="typeservice")
   public List<TypeService> listeTypeProduits(){

       return typeserviceDao.findAll();
   }

   //Récupérer un typeService par son Id
   @GetMapping(value="/typeservice/{id}")
   public TypeService recupererserviceId(@PathVariable int id) {
      return typeserviceDao.findById(id);
   }
   //ajouter un service
   @PostMapping("/typeservice")
   public void ajouterTypeService(@RequestBody TypeService typeservice) {
       typeserviceDao.save(typeservice);
    }

   /*modifier un type service*/
   @PutMapping(value = "/typeservice")
   public void modifierTypeService(@RequestBody TypeService typeservice) {
      typeserviceDao.save(typeservice);
   }

  /* supprimer un typeService*/
   @DeleteMapping(value="/typeservice/{id}")
   public void supprimerTypeService(@PathVariable int id) {
     if(id!=0){
        try {
            TypeService typeservice= typeserviceDao.findById(id);
           typeservice.setIsDeleted(1);
           typeserviceDao.save(typeservice);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
