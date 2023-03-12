package RPNJAVA.SpringJAVA.controller;


import RPNJAVA.SpringJAVA.Service.SaleService;
import RPNJAVA.SpringJAVA.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping("/sale")
    public String findAll(Model model){
        List<Sale> Sale = saleService.findAll();
        model.addAttribute("sale", Sale);
        return "Sale-list";
    }


    @GetMapping("/sale-buyer/{id}")
    public String findAllByBuyer(@PathVariable ("id") int id, Model model){
        List<Sale> sale = saleService.findAllByBuyer(id);
        model.addAttribute("sale",sale);
        return "buyer-statistic";

    }




    @GetMapping("/sale-create")
    public String createSaleForm(Sale sale){
        return "sale-create";
    }

    @PostMapping("/sale-create")
    public String createSale(Sale sale){
        saleService.saveSale(sale);
        return "redirect:/sale";
    }

    @GetMapping("sale-delete/{id}")
    public String deleteSale(@PathVariable("id") Long id){
        saleService.deleteById(id);
        return "redirect:/sale";
    }
}
