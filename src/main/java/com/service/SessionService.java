//package com.service;
//
//import javax.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
////@Service
//public class SessionService {
//    
//    @Autowired
//    private HttpSession session;
//    
//    public boolean isAuthenticated() {
//        boolean authenticated = true;
//        if(session.getAttribute("authenticated") != null) {
//            authenticated = (boolean) session.getAttribute("authenticated");
//        }
//        
//        session.setAttribute("authenticated", authenticated);
//        return authenticated;
//    }
//    
//}
