package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygModepassation;
import sn.ssi.togo.model.SygService;

import java.util.List;

@Repository
public interface ISygServiceDao extends JpaRepository<SygService, Long> {
   // public SygService findById(Long id);
    // Optional<SygRealisations> findById(Long id);
    public List<SygService> findByCodificationIgnoreCase(String codification);

}
