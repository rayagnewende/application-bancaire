package com.banque.app.web;

import com.banque.app.metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BanqueController {

    @Autowired
    private IBanqueMetier banqueMetier ;


    @RequestMapping("/operations")
    public String index(){
        return "comptes";
    }

}
