package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.Service;
import sn.ssi.partail.model.TypeService;

@Repository
public interface ItypeServiceDao extends JpaRepository<TypeService, Integer> {
    public TypeService findById(int id);

}
