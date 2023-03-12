package RPNJAVA.SpringJAVA.controller;


import RPNJAVA.SpringJAVA.Service.CategoryService;
import RPNJAVA.SpringJAVA.Service.ManufacturerService;
import RPNJAVA.SpringJAVA.model.Category;
import RPNJAVA.SpringJAVA.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String findAll(Model model){
        List<Category> Category = categoryService.findAll();
        model.addAttribute("category", Category);
        return "category-list";
    }
}
