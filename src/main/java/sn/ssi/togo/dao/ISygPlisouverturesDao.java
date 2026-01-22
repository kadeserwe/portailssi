package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygPlisouvertures;

@Repository
public interface ISygPlisouverturesDao extends JpaRepository<SygPlisouvertures, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
   // public List<SygLots> findByCodepaysIgnoreCase(String codePays);

}

