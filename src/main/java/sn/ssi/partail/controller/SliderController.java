package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IsliderDao;
import sn.ssi.partail.model.SliderModel;

import java.util.List;

@RestController
public class SliderController {
   @Autowired
   private IsliderDao sliderDao;

    //Récupérer tous les type Slider
   @GetMapping(value="slider")
   public List<SliderModel> listeSliders(){

       return sliderDao.findAll();
   }

   //Récupérer un Sliderpar son Id
   @GetMapping(value="/slider/{id}")
   public SliderModel recupererSliderId(@PathVariable int id) {
      return sliderDao.findById(id);
   }
   //ajouter un Slider
   @PostMapping("/slider")
   public void ajouterSlider(@RequestBody SliderModel sliderModel) {
       sliderDao.save(sliderModel);
    }

   /*modifier un Slider*/
   @PutMapping(value = "/slider")
   public void modifierSlider(@RequestBody SliderModel sliderModel) {
       sliderDao.save(sliderModel);
   }

  /* supprimer un Slider*/
   @DeleteMapping(value="/slider/{id}")
   public void supprimerTypeService(@PathVariable int id) {
     if(id!=0){
        try {
            SliderModel sliderModel = sliderDao.findById(id);
            sliderModel.setIsDeleted(1);
            sliderDao.save(sliderModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
