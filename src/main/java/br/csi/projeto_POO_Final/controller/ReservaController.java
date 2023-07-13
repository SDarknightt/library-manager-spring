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
    public RedirectView reservarLivro (@ModelAttribute("reserva") Reserva reserva, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        if (new ReservaService().cadastrarReserva(reserva)){
            redirectView = new RedirectView("visualizarreservas", true);
        }

        return redirectView;
    }

    @GetMapping("/reservarlivro")
    public String visualizarDados(Model model) {
        List<Cliente> clientes = new ClienteService().obterClientes();
        List<Livro> livros = new LivroService().obterLivros();
        model.addAttribute("livros", livros);
        model.addAttribute("clientes", clientes);
        model.addAttribute("reserva", new Reserva());

        return "reservarlivro";
    }

    @GetMapping("/visualizarreservas")
    public String visualizarReservas(Model model) {
        model.addAttribute("reserva", new ReservaLivro());
        List<ReservaLivro> reserva = new ReservaService().obterReservas(); // Recupera a lista de clientes existentes
        model.addAttribute("reservas", reserva); // Adiciona a lista de clientes ao modelo

        return "visualizarreservas";
    }

    @PostMapping("/deletarreserva")
    public RedirectView deletarreserva (@ModelAttribute("reserva") ReservaLivro reservaLivro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        if (new ReservaService().devolverLivro(reservaLivro)){
            redirectView = new RedirectView("/principal/reservas/visualizarreservas", true);
        }
        return redirectView;
    }

}