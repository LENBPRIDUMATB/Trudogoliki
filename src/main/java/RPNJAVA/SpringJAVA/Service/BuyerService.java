package RPNJAVA.SpringJAVA.Service;

import RPNJAVA.SpringJAVA.model.Buyer;
import RPNJAVA.SpringJAVA.model.Manufacturer;
import RPNJAVA.SpringJAVA.repository.BuyerRepository;
import RPNJAVA.SpringJAVA.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BuyerService {


    @Autowired
    private BuyerRepository buyerRepository;
    public List<Buyer> findAll(){
        return buyerRepository.findAll();
    }
}
