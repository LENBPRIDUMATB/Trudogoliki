package RPNJAVA.SpringJAVA.Service;

import RPNJAVA.SpringJAVA.model.Manufacturer;
import RPNJAVA.SpringJAVA.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ManufacturerService {

    ///
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public Manufacturer findById(String name){
        return manufacturerRepository.getOne(name);
    }

    public List<Manufacturer> findAll(){

        return manufacturerRepository.findAll();
    }

    public Manufacturer saveManufacturer(Manufacturer manufacturer){
        return manufacturerRepository.save(manufacturer);
    }

    public void deleteById(String name){
        manufacturerRepository.deleteById(name);
    }

}
