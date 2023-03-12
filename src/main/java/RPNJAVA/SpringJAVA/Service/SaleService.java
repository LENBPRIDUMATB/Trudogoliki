package RPNJAVA.SpringJAVA.Service;


import RPNJAVA.SpringJAVA.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private RPNJAVA.SpringJAVA.repository.SaleRepository SaleRepository;

    public Sale findById(long id){
        return SaleRepository.getReferenceById(id);

    }

    public List<Sale> findAll(){
        return SaleRepository.findAll();
    }

    public List<Sale> findAllByBuyer(int id){
        return SaleRepository.findSalesByBuyerId(id);
    }

    public Sale saveSale(Sale sale){
        return SaleRepository.save(sale);
    }

    public void deleteById(Long id){
        SaleRepository.deleteById(id);
    }

}
