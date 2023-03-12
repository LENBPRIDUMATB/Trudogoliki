package RPNJAVA.SpringJAVA.controller;

import RPNJAVA.SpringJAVA.Service.BuyerService;
import RPNJAVA.SpringJAVA.model.Buyer;
import RPNJAVA.SpringJAVA.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/buyer")
    public String findAll(Model model){
        List<Buyer> Buyer = buyerService.findAll();
        model.addAttribute("buyer", Buyer);
        return "buyer-list";
    }

}
