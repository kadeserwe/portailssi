package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygDossiers;
import sn.ssi.togo.model.SygFournisseur;

import java.util.List;

@Repository
public interface ISygFournisseurDao extends JpaRepository<SygFournisseur, Integer>{
    public SygFournisseur findById(Long id);

}
