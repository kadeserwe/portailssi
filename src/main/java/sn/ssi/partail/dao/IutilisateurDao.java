package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.UtilisateurModel;

@Repository
public interface IutilisateurDao extends JpaRepository<UtilisateurModel, Integer> {
    public UtilisateurModel findById(int id);

}
