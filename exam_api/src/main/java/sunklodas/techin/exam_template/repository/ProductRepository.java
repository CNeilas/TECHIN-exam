package sunklodas.techin.exam_template.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sunklodas.techin.exam_template.model.Listing;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Listing, Long> {

}
