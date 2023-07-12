package br.csi.projeto_POO_Final.dao;

import br.csi.projeto_POO_Final.model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LivroDAO {
    public void adicionarLivro(Livro livro) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "INSERT INTO livro (nomelivro, genero) VALUES (?, ?)";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, livro.getNome());
            pt.setString(2, livro.getGenero());

            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletarLivro(Livro livro) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "DELETE FROM livro WHERE idlivro = ?";

            System.out.println("Id livro:" + livro.getId());
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, livro.getId());
            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void editarLivro(Livro livro) {
        try (Connection con = new ConectaDB().getConexao()) {
            String sql = "UPDATE livro " +
                    "SET nomelivro = ?, genero = ? " +
                    "WHERE idlivro = ?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, livro.getNome());
            pt.setString(2, livro.getGenero());
            pt.setInt(3, livro.getId());
            pt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Livro> getLivros(){
        ArrayList<Livro> livros = new ArrayList<>();
        try(Connection con = new ConectaDB().getConexao()){

            String sql = "SELECT * " +
                    "FROM livro ORDER BY idlivro";

            PreparedStatement pt = con.prepareStatement(sql);
            //pt.setString(1, login);
            System.out.println("sql: "+pt.toString());
            ResultSet rs = pt.executeQuery();

            while (rs.next()){
                livros.add(new Livro(
                                    rs.getInt("idlivro"),
                                    rs.getString("nomelivro"),
                                    rs.getString("genero"),
                                    rs.getBoolean("reservado")
                                    ));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return livros;
    }

    public Livro getLivro( int idLivro ){
        Livro livro = new Livro();
        try(Connection con = new ConectaDB().getConexao()){

            String sql = "SELECT * " +
                    "FROM livro WHERE idlivro = ?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, idLivro);
            System.out.println("sql: "+pt.toString());
            ResultSet rs = pt.executeQuery();

            while (rs.next()){
                livro.setId(rs.getInt("idlivro"));
                livro.setNome(rs.getString("nomelivro"));
                livro.setGenero(rs.getString("genero"));
                livro.setRetirado(rs.getBoolean("reservado"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Nome do livro: "+livro.getNome());

        return livro;
    }


}
