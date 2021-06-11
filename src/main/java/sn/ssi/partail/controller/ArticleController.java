package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IarticleDao;
import sn.ssi.partail.dao.IcandidatureDao;
import sn.ssi.partail.model.ArticleModel;
import sn.ssi.partail.model.CandidatureModel;

import java.util.List;

@RestController
public class ArticleController {
   @Autowired
   private IarticleDao articleDao;

    //Récupérer tous les Articles
   @GetMapping(value="article")
   public List<ArticleModel> listeArticles(){

       return articleDao.findAll();
   }

   //Récupérer un Article par son Id
   @GetMapping(value="/article/{id}")
   public ArticleModel recupererArticleDaoId(@PathVariable int id) {
      return articleDao.findById(id);
   }
   //ajouter un Article
   @PostMapping("/article")
   public void ajouterArticle(@RequestBody ArticleModel articleModel) {
       articleDao.save(articleModel);
    }

   /*modifier un Article*/
   @PutMapping(value = "/article")
   public void modifierArticle(@RequestBody ArticleModel articleModel) {
       articleDao.save(articleModel);
   }

  /* supprimer un article*/
   @DeleteMapping(value="/article/{id}")
   public void supprimerArticle(@PathVariable int id) {
     if(id!=0){
        try {
            ArticleModel articleModel = articleDao.findById(id);
            articleModel.setIsDeleted(1);
            articleDao.save(articleModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
