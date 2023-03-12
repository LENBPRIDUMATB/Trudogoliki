package RPNJAVA.SpringJAVA.controller;


import RPNJAVA.SpringJAVA.Service.ManufacturerService;
import RPNJAVA.SpringJAVA.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ManufacturerController {


    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping("/manufacturer")
    public String findAll(Model model){
        List<Manufacturer> Manufacturer = manufacturerService.findAll();
        model.addAttribute("manufacturer", Manufacturer);
        return "manufacturer-list";
    }

    @GetMapping("/manufacturer-create")
    public String createManufacturerForm(Manufacturer manufacturer){
        return "manufacturer-create";
    }

    @PostMapping
    public String createManufacturer(Manufacturer manufacturer){
        manufacturerService.saveManufacturer(manufacturer);
        return "redirect:/manufacturer";
    }
}
