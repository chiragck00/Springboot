package com.springboot.learning.scope.session;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class ControllerSess {

    @Autowired
    UserSess u;

    ControllerSess(){
        System.out.println("Controller 1 bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Controller 1 hashcode : " + this.hashCode() + " User hashcode: " + u.hashCode());
    }

    @GetMapping("/api")
    public String get(){
        System.out.println("Fetched");
        return "Fetched";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        System.out.println("Logout");
        session.invalidate();
        return "Logout";
    }
}



