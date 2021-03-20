package com.sarah.tdd_bdd.validadorCpf.Controllers;

import org.springframework.ui.Model;
import com.sarah.tdd_bdd.validadorCpf.models.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/valida-cpf")
    public String validaCpf(Cliente cliente, Model model){
    boolean verdade = cliente.validarCPF();
    model.addAttribute("verdade", verdade);
    return "home/validaCpf";
    }

}