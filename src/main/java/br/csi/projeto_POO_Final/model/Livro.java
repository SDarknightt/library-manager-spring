package br.csi.projeto_POO_Final.model;

public class Livro {
    private int id;
    private String nome;
    private String genero;
    private Boolean retirado;

    public Livro(){}

    public Livro(int id, String nome, String genero, Boolean retirado) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.retirado = retirado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getRetirado() {
        return retirado;
    }

    public void setRetirado(Boolean retirado) {
        this.retirado = retirado;
    }
}

