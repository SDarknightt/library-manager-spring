package br.csi.projeto_POO_Final.controller;

import br.csi.projeto_POO_Final.dao.LivroDAO;
import br.csi.projeto_POO_Final.model.Livro;
import br.csi.projeto_POO_Final.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/visualizarlivros")
    public String visualizarLivros(Model model) {
        model.addAttribute("livro", new Livro());
        List<Livro> livros = new LivroService().obterLivros(); // Recupera a lista de clientes existentes
        model.addAttribute("livros", livros); // Adiciona a lista de clientes ao modelo
        return "visualizarlivros";
    }

    @PostMapping("/deletarlivro")
    public RedirectView deletarLivro (@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        if (new LivroService().deletarLivro(livro)){
            redirectView = new RedirectView("/principal/livros/visualizarlivros", true);
        }
        return redirectView;
    }

    @GetMapping("/editarlivro/{id}")
    public String editarLivro(@PathVariable int id, Model model) {
        model.addAttribute("livro", new LivroDAO().getLivro(id));
        return "editarlivro";
    }

    @PostMapping("/selecionalivro")
    public RedirectView selecionaLivro (@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
            redirectView = new RedirectView("/principal/livros/editarlivro/"+livro.getId(), true);
        return redirectView;
    }

    @PostMapping("/editarlivro")
    public RedirectView editarLivro (@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;
        if (new LivroService().editarLivro(livro)){
            redirectView = new RedirectView("/principal/livros/visualizarlivros", true);
        }
        return redirectView;
    }

}
