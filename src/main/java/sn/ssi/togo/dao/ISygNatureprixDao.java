package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygMonnaieoffre;
import sn.ssi.togo.model.SygNatureprix;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygNatureprixDao extends JpaRepository<SygNatureprix, Long> {
    public List<SygNatureprix> findByNatCodeIgnoreCase(String natCode);


}
