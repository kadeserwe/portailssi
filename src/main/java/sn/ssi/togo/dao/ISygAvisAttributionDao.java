package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygAppelsOffres;
import sn.ssi.togo.model.SygAvisAttribution;

import java.util.List;

@Repository
public interface ISygAvisAttributionDao extends JpaRepository<SygAvisAttribution, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
    public List<SygAvisAttribution> findByAttriRefIgnoreCase(String attriRef);

}

