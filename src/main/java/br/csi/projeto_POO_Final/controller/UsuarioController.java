package br.csi.projeto_POO_Final.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UsuarioController {

    @GetMapping("/registrar")
    public String registraUsuario(Model model){
        return "registrar";
    }

    @GetMapping("/principal")
    public String Login(Model model){
        return "principal";
    }

}
