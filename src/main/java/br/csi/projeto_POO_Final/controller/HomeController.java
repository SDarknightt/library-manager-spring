package br.csi.projeto_POO_Final.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/principal")
public class HomeController {

    @GetMapping("/livros")
    public String livros(Model model){
        return "livros";
    }

    @GetMapping("/clientes")
    public String clientes(Model model){
        return "clientes";
    }

    @GetMapping("/reservas")
    public String reservas(Model model){
        return "reservas";
    }
}