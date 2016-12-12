package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.repository.VitsiRepository;

@Controller
public class VitsiController {
    
    @Autowired
    private VitsiRepository muistiinpanoRepository;
    
    @RequestMapping("/")
    public String list(Model model) {
        model.addAttribute("tasks", muistiinpanoRepository.findAll());
        return "tasks";
    }
    
}
