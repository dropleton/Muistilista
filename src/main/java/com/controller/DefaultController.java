package com.controller;

import com.domain.Kayttaja;
import com.domain.Vitsi;
import com.repository.KayttajaRepository;
import com.repository.VitsiRepository;
import com.service.SessionService;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    private KayttajaRepository kayttajaRepository;
    
    @Autowired
    private VitsiRepository vitsiRepository;
    
    @Autowired
    private SessionService sessionService;
    
    @PostConstruct
    public void init() {
        if(kayttajaRepository.findByUsername("jenni") != null) {
            return;
        }
        
        Kayttaja user = new Kayttaja();
        user.setUsername("jenni");
        user.setPassword(passwordEncoder.encode("porkkana"));
        
        user = kayttajaRepository.save(user);
        
        Vitsi vitsi = new Vitsi();
        vitsi.setOtsikko("Testi");
        vitsi.setSisalto("Sisalto");
        vitsi.setKayttaja(user);
        vitsiRepository.save(vitsi);
    }
    
    @RequestMapping("*")
    @ResponseBody
    public String handleDefault() {
        return "redirect:/jokes";
    }
    
}
