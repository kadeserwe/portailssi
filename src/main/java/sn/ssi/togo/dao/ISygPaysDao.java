package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygAppelsOffres;
import sn.ssi.togo.model.SygPays;

import java.util.List;

@Repository
public interface ISygPaysDao extends JpaRepository<SygPays, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
    public List<SygPays> findByCodepaysIgnoreCase(String codePays);

}

