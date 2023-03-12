package RPNJAVA.SpringJAVA.Service;

import RPNJAVA.SpringJAVA.model.Part;
import RPNJAVA.SpringJAVA.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository partRepository;

    public List<Part> findAll(){
        return partRepository.findAll();
    }

    public Part findById(long id){
        return partRepository.getReferenceById(id);
    }

    public Part savePart(Part part){
        return partRepository.save(part);
    }
}
