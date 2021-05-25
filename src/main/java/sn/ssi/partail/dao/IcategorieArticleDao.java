package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.CategorieArticleModel;

@Repository
public interface IcategorieArticleDao extends JpaRepository<CategorieArticleModel, Integer> {
    public CategorieArticleModel findById(int id);

}
