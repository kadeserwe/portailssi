package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygAttributions;

import java.util.List;

@Repository
public interface ISygAttributionsDao extends JpaRepository<SygAttributions, Long> {
    public List<SygAttributions> findByReferenceAvisGeneralIgnoreCase(String referenceAvisGeneral);
    public List<SygAttributions> findByReferencePlandePassationIgnoreCase(String referencePlandePassation);

}
