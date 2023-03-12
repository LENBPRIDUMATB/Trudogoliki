package RPNJAVA.SpringJAVA.Service;

import RPNJAVA.SpringJAVA.model.Category;
import RPNJAVA.SpringJAVA.model.Manufacturer;
import RPNJAVA.SpringJAVA.repository.CategoryRepository;
import RPNJAVA.SpringJAVA.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
