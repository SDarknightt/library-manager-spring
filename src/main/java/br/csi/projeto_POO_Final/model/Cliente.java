package br.csi.projeto_POO_Final.model;

public class Cliente {
    private String nome;
    private String cpf;
    private int id;

    public Cliente() {}

    public Cliente(int id, String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
