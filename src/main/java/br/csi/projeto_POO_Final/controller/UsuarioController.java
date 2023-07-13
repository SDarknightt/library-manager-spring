package br.csi.projeto_POO_Final.controller;

import br.csi.projeto_POO_Final.model.Usuario;
import br.csi.projeto_POO_Final.service.LoginService;
import br.csi.projeto_POO_Final.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/logarusuario")
    public String loginUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "index";
    }

    @PostMapping("/logarusuario")
    public RedirectView loginUsuario (@ModelAttribute ("usuario") Usuario usuario, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;

        if (new LoginService().autenticar(usuario.getLogin(), usuario.getSenha())){
            redirectView = new RedirectView("/usuario/principal", true);
        }
        else{
            redirectView = new RedirectView("/usuario/logarusuario", true);
        }
        return redirectView;
    }

    @GetMapping("/principal")
    public String Login(Model model){
        return "principal";
    }


    @GetMapping("/cadastrarusuario")
    public String cadastrarUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registrar";
    }

    @PostMapping("/cadastrarusuario")
    public RedirectView cadastrarUsuario (@ModelAttribute ("usuario") Usuario usuario, RedirectAttributes redirectAttributes){
        RedirectView redirectView = null;

        if (new UsuarioService().cadastrarUsuario(usuario)){
            redirectView = new RedirectView("/usuario/principal", true);
        }
        else{
            redirectView = new RedirectView("/usuario/logarusuario", true);
        }
        return redirectView;
    }
}
