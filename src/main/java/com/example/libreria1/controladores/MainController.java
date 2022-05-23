package com.example.libreria1.controladores;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class MainController {

    @GetMapping("")
    public String index(Principal principal) {
        if (principal == null) {
            return "redirect:/";
        }
        return "index";
    }
}
