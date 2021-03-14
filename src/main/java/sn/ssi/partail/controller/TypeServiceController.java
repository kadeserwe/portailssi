package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.ItypeServiceDao;
import sn.ssi.partail.model.TypeServiceModel;

import java.util.List;

@RestController
@RequestMapping(path = "/portail")
@CrossOrigin(origins = "*")
public class TypeServiceController {
   @Autowired
   private ItypeServiceDao typeserviceDao;

    //Récupérer tous les type services
   @GetMapping(value="typeservice")
   public List<TypeServiceModel> listeTypeProduits(){

       return typeserviceDao.findAll();
   }

   //Récupérer un typeService par son Id
   @GetMapping(value="/typeservice/{id}")
   public TypeServiceModel recupererserviceId(@PathVariable int id) {
      return typeserviceDao.findById(id);
   }
   //ajouter un service
   @PostMapping("/typeservice")
   public void ajouterTypeService(@RequestBody TypeServiceModel typeservice) {
       typeserviceDao.save(typeservice);
    }

   /*modifier un type service*/
   @PutMapping(value = "/typeservice")
   public void modifierTypeService(@RequestBody TypeServiceModel typeservice) {
      typeserviceDao.save(typeservice);
   }

  /* supprimer un typeService*/
   @DeleteMapping(value="/typeservice/{id}")
   public void supprimerTypeService(@PathVariable int id) {
     if(id!=0){
        try {
            TypeServiceModel typeservice= typeserviceDao.findById(id);
           typeservice.setIsDeleted(1);
           typeserviceDao.save(typeservice);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
