package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.Produit;

import java.util.List;

@Repository
public interface IproduitDao extends JpaRepository<Produit, Integer> {
    public Produit findById(int id);

}
