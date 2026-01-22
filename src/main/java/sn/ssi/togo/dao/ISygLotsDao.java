package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygLots;

import java.util.List;

@Repository
public interface ISygLotsDao extends JpaRepository<SygLots, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
   // public List<SygLots> findByCodepaysIgnoreCase(String codePays);

}

