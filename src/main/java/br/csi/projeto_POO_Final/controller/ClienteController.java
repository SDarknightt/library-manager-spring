package br.csi.projeto_POO_Final.controller;

import br.csi.projeto_POO_Final.dao.ClienteDAO;
import br.csi.projeto_POO_Final.dao.LivroDAO;
import br.csi.projeto_POO_Final.model.Cliente;
import br.csi.projeto_POO_Final.model.Livro;
import br.csi.projeto_POO_Final.service.ClienteService;
import br.csi.projeto_POO_Final.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

        model.addAttribute("cliente", new Cliente());

        List<Cliente> clientes = new ClienteService().obterClientes(); // Recupera a lista de clientes existentes
        model.addAttribute("clientes", clientes); // Adiciona a lista de clientes ao modelo
        return "visualizarclientes";
    }

    @PostMapping("/deletarcliente")
    public RedirectView deletarCliente (@ModelAttribute("cliente") Cliente cliente, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        if (new ClienteService().deletarCliente(cliente)){
            redirectView = new RedirectView("/principal/clientes/visualizarclientes", true);
        }
        return redirectView;
    }

    //pega o id da url, pega os dados do cliente e envia para a pagina editarcliente
    @GetMapping("/editarcliente/{id}")
    public String editarCliente(@PathVariable int id, Model model) {
        System.out.println("ID Editar Cliente: " + id);
        model.addAttribute("cliente", new ClienteDAO().getCliente(id));
        Cliente cliente =  new ClienteDAO().getCliente(id);
        System.out.println("Informações do cliente: " + cliente.getNome() + cliente.getCpf() );

        return "editarcliente";
    }

    //seleciona a partir do form visualizar clientes
    @PostMapping("/selecionacliente")
    public RedirectView selecionaCliente (@ModelAttribute("cliente") Cliente cliente, RedirectAttributes redirectAttributes){
        System.out.println("Cliente selecionado ID:" + cliente.getId());
        RedirectView redirectView = null;
        redirectView = new RedirectView("/principal/clientes/editarcliente/"+cliente.getId(), true);
        return redirectView;
    }

    //pega as alterações e efetua no banco
    @PostMapping("/editarcliente")
    public RedirectView editarCliente (@ModelAttribute("cliente") Cliente cliente, RedirectAttributes redirectAttributes){
        System.out.println("Entrou no editar cliente!!!!!!");
        RedirectView redirectView = null;
        if (new ClienteService().editarCliente(cliente)){
            redirectView = new RedirectView("/principal/clientes/visualizarclientes", true);
        }
        return redirectView;
    }
}
