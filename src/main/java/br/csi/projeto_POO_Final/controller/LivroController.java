package br.csi.projeto_POO_Final.controller;


import br.csi.projeto_POO_Final.model.Cliente;
import br.csi.projeto_POO_Final.model.Livro;
import br.csi.projeto_POO_Final.service.ClienteService;
import br.csi.projeto_POO_Final.service.LivroService;
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
@RequestMapping("principal/livros")
public class LivroController {

    @GetMapping("/registrarlivro")
    public String cadastrarLivro(Model model){
        model.addAttribute("livro", new Livro());
        return "registrarlivro";
    }

    @PostMapping("/registrarlivro")
    public RedirectView cadastrarLivro (@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;

        if (new LivroService().cadastrarLivro(livro)){
            redirectView = new RedirectView("/principal/livros/visualizarlivros", true);
        }

        return redirectView;
    }

    @PostMapping("/deletarlivro")
    public RedirectView deletarLivro (@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;

        if (new LivroService().deletarLivro(livro)){
            redirectView = new RedirectView("/principal/livros/visualizarlivros", true);
        }
        return redirectView;
    }

    @GetMapping("/visualizarlivros")
    public String visualizarLivros(Model model) {
        List<Livro> livros = new LivroService().obterLivros(); // Recupera a lista de clientes existentes
        model.addAttribute("livros", livros); // Adiciona a lista de clientes ao modelo
        return "visualizarlivros";
    }

}
