//package sn.ssi.togo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import sn.ssi.togo.dao.ISygDivisionDao;
//import sn.ssi.togo.dao.ISygTypesmarchesDao;
//import sn.ssi.togo.model.SygDivision;
//import sn.ssi.togo.model.SygTypesmarches;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class SygDivisionController {
//   @Autowired
//   private ISygDivisionDao sygDivisionDao;
//
//    //Récupérer tous les SygDivision
//   @GetMapping(value="division")
//   public List<SygDivision> listeSygDivisions(){
//
//       return sygDivisionDao.findAll();
//   }
//
//   //Récupérer un SygDivision par son Id
//   @GetMapping(value= "/division/{id}")
//   public Optional <SygDivision> recupererSygDivisionId(@PathVariable Long id) {
//       Optional <SygDivision> division =sygDivisionDao.findById(id);
//
//       return division;
//   }
//   //ajouter un SygDivision
//   @PostMapping(value = "/division")
//   public void ajouterSygDivision(@RequestBody SygDivision sygDivision) {
//
//       sygDivisionDao.save(sygDivision);
//    }
//
//   /*modifier un SygDivision*/
//   @PutMapping(value = "/division")
//   public void modifierSygdivision(@Valid @RequestBody SygDivision sygDivision) {
//
//       sygDivisionDao.save(sygDivision);
//   }
//
//
//
//
//}
