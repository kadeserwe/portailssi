package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygModeselection;
import sn.ssi.togo.model.SygMonnaieoffre;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygMonnaieoffreDao extends JpaRepository<SygMonnaieoffre, Long> {
    public List<SygMonnaieoffre> findByMonCodeIgnoreCase(String monCode);


}
