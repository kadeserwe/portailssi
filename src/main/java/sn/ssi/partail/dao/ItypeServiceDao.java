package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.TypeServiceModel;

@Repository
public interface ItypeServiceDao extends JpaRepository<TypeServiceModel, Integer> {
    public TypeServiceModel findById(int id);

}
