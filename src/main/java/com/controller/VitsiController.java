package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.repository.VitsiRepository;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VitsiController {
    
    @Autowired
    private VitsiRepository vitsiRepository;
    
    @RequestMapping(value = "/jokes", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("jokes", vitsiRepository.findAll());
        return "jokes";
    }
    
}
