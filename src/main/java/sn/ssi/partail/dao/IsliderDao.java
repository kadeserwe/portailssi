package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.SliderModel;

@Repository
public interface IsliderDao extends JpaRepository<SliderModel, Integer> {
    public SliderModel findById(int id);

}
