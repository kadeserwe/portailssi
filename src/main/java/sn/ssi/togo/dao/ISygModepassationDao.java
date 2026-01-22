package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygAppelsOffres;
import sn.ssi.togo.model.SygModepassation;

import java.util.List;

@Repository
public interface ISygModepassationDao extends JpaRepository<SygModepassation, Long> {
   // public SygModepassation findById(Long id);
    public List<SygModepassation> findByCodeIgnoreCase(String code);

}
