package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.CategorieArticleModel;
import sn.ssi.partail.model.WebinarModel;

@Repository
public interface IwebinarDao extends JpaRepository<WebinarModel, Integer> {
    public WebinarModel findById(int id);

}
