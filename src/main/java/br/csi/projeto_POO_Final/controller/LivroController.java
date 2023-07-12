package br.csi.projeto_POO_Final.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("principal/livros")
public class LivroController {

    @GetMapping("/registrarlivro")
    public String RegistrarLivro(Model model){
        return "registrarlivro";
    }

    @GetMapping("/visualizarlivros")
    public String VisualizarLivros(Model model){
        return "visualizarlivros";
    }

}
