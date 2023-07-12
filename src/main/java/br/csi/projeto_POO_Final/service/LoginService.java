package br.csi.projeto_POO_Final.service;

import br.csi.projeto_POO_Final.dao.UsuarioDAO;
import br.csi.projeto_POO_Final.model.Usuario;

public class LoginService {

    public boolean autenticar(String login, String senha){

        Usuario u = new UsuarioDAO().getUsuario(login);
        if(u.getLogin() == null){
            System.out.println("usuário null -> "+u.getLogin());
            return false;
        }else{
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return true;
            }else{
                return false;
            }
        }
    }
}
