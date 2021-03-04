package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.ProduitModel;

@Repository
public interface IproduitDao extends JpaRepository<ProduitModel, Integer> {
    public ProduitModel findById(int id);

}
