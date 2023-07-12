package br.csi.projeto_POO_Final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("principal/clientes")
public class ClienteController {

    @GetMapping("/registrarcliente")
    public String RegistrarCliente(Model model){
        return "registrarcliente";
    }

    @GetMapping("/visualizarclientes")
    public String VisualizarClientes(Model model){
        return "visualizarreservas";
    }

}
