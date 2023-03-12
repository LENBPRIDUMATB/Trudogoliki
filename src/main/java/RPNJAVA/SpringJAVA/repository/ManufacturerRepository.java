package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, String> {

}
