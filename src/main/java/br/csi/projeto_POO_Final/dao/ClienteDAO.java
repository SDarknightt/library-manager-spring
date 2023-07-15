package br.csi.projeto_POO_Final.dao;

import br.csi.projeto_POO_Final.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {//aqui será feito o CRUD

    public ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        try(Connection con = new ConectaDB().getConexao()){

            String sql = "SELECT * " +
                    "FROM cliente ORDER BY nomecliente";

            PreparedStatement pt = con.prepareStatement(sql);
            //pt.setString(1, login);
            System.out.println("sql: "+pt.toString());
            ResultSet rs = pt.executeQuery();

            while (rs.next()){
                clientes.add(new Cliente(
                        rs.getInt("idcliente"),
                        rs.getString("nomecliente"),
                        rs.getString("cpfcliente")
                ));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return clientes;
    }


    public boolean verificarClienteExistente(String cpf) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "SELECT COUNT(*) FROM cliente WHERE cpfcliente = ?";
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, cpf);
            System.out.println(pt);
            ResultSet rs = pt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if(count > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public void adicionarCliente(Cliente cliente) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "INSERT INTO cliente (nomecliente, cpfcliente) VALUES (?, ?)";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, cliente.getNome());
            pt.setString(2, cliente.getCpf());

            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deletarCliente(Cliente cliente) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "DELETE FROM cliente WHERE idcliente = ?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, cliente.getId());
            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object editarCliente(Cliente cliente) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "UPDATE cliente " +
                    "SET nomecliente = ?, cpfcliente = ? " +
                    "WHERE idcliente = ?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, cliente.getNome());
            pt.setString(2, cliente.getCpf());
            pt.setInt(3, cliente.getId());
            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cliente;
    }

    public Cliente getCliente( int idCLiente ){
        Cliente cliente = new Cliente();
        try(Connection con = new ConectaDB().getConexao()){

            String sql = "SELECT * " +
                    "FROM cliente WHERE idcliente = ?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, idCLiente);
            System.out.println("sql: "+pt.toString());
            ResultSet rs = pt.executeQuery();

            while (rs.next()){
                cliente.setId(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nomecliente"));
                cliente.setCpf(rs.getString("cpfcliente"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Nome do Cliente: "+cliente.getNome());

        return cliente;
    }
}
