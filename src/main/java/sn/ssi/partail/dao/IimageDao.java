package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.ImageModel;

@Repository
public interface IimageDao extends JpaRepository<ImageModel, Integer> {
    public ImageModel findById(int id);

}
