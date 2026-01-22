package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygAppelsOffres;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISygAppelsOffresDao extends JpaRepository<SygAppelsOffres, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
    public List<SygAppelsOffres> findByAporeferenceIgnoreCase(String aporeference);

}

