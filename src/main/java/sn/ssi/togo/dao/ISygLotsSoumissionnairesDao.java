package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygLotsSoumissionnaires;

import java.util.List;

@Repository
public interface ISygLotsSoumissionnairesDao extends JpaRepository<SygLotsSoumissionnaires, Long> {
    //Optional<SygAppelsOffres> findById(Long id);
    //public List<SygLotsSoumissionnaires> findByPlilraisonsocialeCase(String plilraisonsociale);

}

