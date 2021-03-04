package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.TextPrixDistModel;

@Repository
public interface ItextPrixDistDao extends JpaRepository<TextPrixDistModel, Integer> {
    public TextPrixDistModel findById(int id);

}
