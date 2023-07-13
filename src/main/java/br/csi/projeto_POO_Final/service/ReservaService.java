
package br.csi.projeto_POO_Final.service;

import br.csi.projeto_POO_Final.dao.ReservaDAO;
import br.csi.projeto_POO_Final.model.Reserva;
import br.csi.projeto_POO_Final.model.ReservaLivro;

import java.util.List;

public class ReservaService {

    private ReservaDAO reservaDAO;

    public ReservaService() {
        this.reservaDAO = new ReservaDAO();
    }


    /*---------> Cadastrar Reserva<---------*/
    public boolean cadastrarReserva(Reserva reserva) {
        ReservaDAO reservaDAO = new ReservaDAO();
        // Adicionar a reserva no banco de dados
        reservaDAO.adicionarReserva(reserva);
        System.out.println("Reserva cadastrada com sucesso: Livro -" + reserva.getLivroid() + "Cliente -" + reserva.getClienteid());
        return true;
    }

    public boolean devolverLivro(ReservaLivro reservaLivro) {
        ReservaDAO reservaDAO = new ReservaDAO();
        // Remove a reserva do banco de dados
        reservaDAO.cancelarReserva(reservaLivro);
        System.out.println("Reserva cancelada com sucesso: Reserva -" + reservaLivro.getIdreserva());
        return true;
    }

    public boolean editarReserva(Reserva reserva) {
        ReservaDAO reservaDAO = new ReservaDAO();
        // Editar a reserva no banco de dados
        reservaDAO.editarReserva(reserva);
        System.out.println("Reserva editada com sucesso: Livro -" + reserva.getLivroid() + "Cliente -" + reserva.getClienteid());
        return true;
    }

    public List<ReservaLivro> obterReservas() {
        ReservaDAO reservaDAO = new ReservaDAO();
        return reservaDAO.getReservas();
    }

}
