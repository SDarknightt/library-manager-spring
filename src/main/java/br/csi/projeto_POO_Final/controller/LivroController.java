package br.csi.projeto_POO_Final.controller;


import br.csi.projeto_POO_Final.model.Livro;
import br.csi.projeto_POO_Final.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
