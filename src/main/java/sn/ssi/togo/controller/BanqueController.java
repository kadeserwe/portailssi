//package sn.ssi.togo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import sn.ssi.togo.dao.IBanqueDao;
//import sn.ssi.togo.model.Banque;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class BanqueController {
//   @Autowired
//   private IBanqueDao banqueDao;
//
//    //Récupérer tous les Banque
//   @GetMapping("/banque")
//   public List<Banque> listeBanques(){
//
//       return banqueDao.findAll();
//   }
//
//   //Récupérer un Banque par son sigle
//   @GetMapping("/banque/sigle/{sigle}")
//   public List<Banque> recupererBanqueDaoIdReference(@PathVariable String sigle) {
//       List<Banque> banguiSigle = banqueDao.findBySigleIgnoreCase(sigle);
//      return banguiSigle;
//   }
//
//    @GetMapping("/banque/{id}")
//    public Optional <Banque> recupererBanqueDaoId(@PathVariable Long id) {
//        Optional <Banque> banque = banqueDao.findById(id);
//        return banque;
//    }
//   //ajouter un Banque
//   @PostMapping("/banque")
//   public void ajouterArticle(@RequestBody Banque banque) {
//       banqueDao.save(banque);
//    }
//
//   /*modifier un Banque*/
//   @PutMapping(value = "/banque")
//   public void modifierBanque(@RequestBody Banque banque) {
//       banqueDao.save(banque);
//   }
//
//  /* supprimer un Banque*/
//   /*@DeleteMapping(value="/article/{id}")
//   public void supprimerBanque(@PathVariable int id) {
//     if(id!=0){
//        try {
//            *//*Banque banque = banqueDao.findById(id);
//            banque.setIsDeleted(1);
//            banqueDao.save(banque);*//*
//        }catch (Exception e) {
//           e.printStackTrace();
//        }
//     }
//
//   }*/
//
//
//}
