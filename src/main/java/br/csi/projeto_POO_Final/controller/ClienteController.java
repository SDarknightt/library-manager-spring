package br.csi.projeto_POO_Final.controller;

import br.csi.projeto_POO_Final.model.Cliente;
import br.csi.projeto_POO_Final.model.Usuario;
import br.csi.projeto_POO_Final.service.ClienteService;
import br.csi.projeto_POO_Final.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("principal/clientes")
public class ClienteController {
    @GetMapping("/registrarcliente")
    public String cadastrarCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "registrarcliente";
    }

    @PostMapping("/registrarcliente")
    public RedirectView cadastrarCliente (@ModelAttribute("cliente") Cliente cliente, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;

        if (new ClienteService().cadastrarCliente(cliente)){
            redirectView = new RedirectView("visualizarclientes", true);
        }

        return redirectView;
    }

    @GetMapping("/visualizarclientes")
    public String visualizarClientes(Model model) {
        List<Cliente> clientes = new ClienteService().obterClientes(); // Recupera a lista de clientes existentes
        model.addAttribute("clientes", clientes); // Adiciona a lista de clientes ao modelo
        return "visualizarclientes";
    }

}
