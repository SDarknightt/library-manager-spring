package br.csi.projeto_POO_Final.controller;

import br.csi.projeto_POO_Final.model.Cliente;
import br.csi.projeto_POO_Final.model.Livro;
import br.csi.projeto_POO_Final.model.Reserva;
import br.csi.projeto_POO_Final.model.ReservaLivro;
import br.csi.projeto_POO_Final.service.ClienteService;
import br.csi.projeto_POO_Final.service.LivroService;
import br.csi.projeto_POO_Final.service.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("principal/reservas")
public class ReservaController {

    @PostMapping("/reservarlivro")
    public RedirectView reservarLivro (@RequestParam("idcliente") Long idCliente, @RequestParam("idlivro") Long idLivro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        System.out.println("Entrou no RESERVAR LIVRO!!!!!");
        if (new ReservaService().cadastrarReserva()){
            redirectView = new RedirectView("visualizarclientes", true);
        }
        redirectView = new RedirectView("visualizarreservas", true);

        return redirectView;
    }


    @GetMapping("/reservarlivro")
    public String visualizarDados(Model model) {
        ClienteService clienteService = new ClienteService();
        LivroService livroService = new LivroService();
        List<Livro> livros = livroService.obterLivros();
        List<Cliente> clientes = clienteService.obterClientes();

        model.addAttribute("clientes", clientes);
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("livros", livros);

        return "reservarlivro";
    }


    @GetMapping("/visualizarreservas")
    public String visualizarReservas(Model model) {
        List<ReservaLivro> reserva = new ReservaService().obterReservas(); // Recupera a lista de clientes existentes
        model.addAttribute("reservas", reserva); // Adiciona a lista de clientes ao modelo
        return "visualizarreservas";
    }

}
