package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygRealisations;


import java.util.List;

@Repository
public interface ISygRealisationsDao extends JpaRepository<SygRealisations, Long> {
   // public SygRealisations findById(Long id);
   // @Transient
   // Optional<SygRealisations> findById(Long id);
   public List<SygRealisations> findByReferenceIgnoreCase(String reference);

}
