package br.csi.projeto_POO_Final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("principal/reservas")
public class ReservaController {

    @GetMapping("/reservarlivro")
    public String ReservarLivro(Model model){
        return "reservarlivro";
    }

    @GetMapping("/visualizarreservas")
    public String VisualizarReservas(Model model){
        return "visualizarreservas";
    }

}
