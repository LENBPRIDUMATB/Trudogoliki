package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}

