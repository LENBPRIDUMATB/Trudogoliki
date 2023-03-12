package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
