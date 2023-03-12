package RPNJAVA.SpringJAVA.controller;

import RPNJAVA.SpringJAVA.Service.PartService;
import RPNJAVA.SpringJAVA.model.Part;
import RPNJAVA.SpringJAVA.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PartController {

    private final PartService partService;

    @Autowired
    public PartController(PartService partService){
        this.partService = partService;
    }

    @GetMapping("/part")
    public String findAll(Model model){
        List<Part> part = partService.findAll();
        model.addAttribute("part",part);
        return "part-list";
    }

    @GetMapping("/part-create")
    public String createPartForm(Part part){
        return "part-create";
    }

    @PostMapping("/part-create")
    public String createPart(Part part){
        partService.savePart(part);
        //добавить запрос всех категорий
        return "redirect:/part";
    }

    @GetMapping("part-update/{id}")
    public String updatePartForm(@PathVariable("id") Long id, Model model){
        Part part = partService.findById(id);
        model.addAttribute("part", part);
        return "/part-update";
    }

    @PostMapping("part-update")
    public String updateUser(Part part){
        partService.savePart(part);
        return "redirect:/part";
    }

}
