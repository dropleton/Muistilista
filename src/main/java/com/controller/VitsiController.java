package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.repository.VitsiRepository;
//import com.service.SessionService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VitsiController {
    
    @Autowired
    private VitsiRepository vitsiRepository;
    
//    @Autowired
//    private SessionService sessionService;
//    
//    @RequestMapping("*")
//    @ResponseBody
//    public String session() {
//        sessionService.isAuthenticated();
//    }
    
    @RequestMapping(value = "/jokes", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("jokes", vitsiRepository.findAll());
        System.out.println("asd");
        return "jokes";
    }
    
}
