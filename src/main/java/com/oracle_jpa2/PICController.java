package com.oracle_jpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PICController {
    @Autowired
    private PICRepository picRepo;

    @GetMapping("/data")
    public String listAll(Model model) {
        List<PIC> listPics = picRepo.findAll();
        model.addAttribute("listPics", listPics);
        System.out.println(listPics);
        return "Data";
    }
}