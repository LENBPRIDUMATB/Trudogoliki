package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}
