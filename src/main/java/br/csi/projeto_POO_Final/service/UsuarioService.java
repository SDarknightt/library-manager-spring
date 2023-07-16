package br.csi.projeto_POO_Final.service;

import br.csi.projeto_POO_Final.dao.UsuarioDAO;
import br.csi.projeto_POO_Final.model.Usuario;
import org.springframework.stereotype.Service;


public class UsuarioService {


    public boolean cadastrarUsuario(Usuario usuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Verificar se o login já está em uso
        boolean loginExistente = usuarioDAO.verificarLoginExistente(usuario);
        if (loginExistente) {
            System.out.println("Login já está em uso: " + usuario.getLogin());
            return false;
        }

        // Adicionar o usuário no banco de dados
        usuarioDAO.adicionarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getLogin());
        return true;
    }


}
