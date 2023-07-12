package br.csi.projeto_POO_Final.model;

public class ReservaLivro {

    private int idreserva;
    private int clienteid;
    private String nomecliente;
    private int livroid;
    private String nomelivro;

    public ReservaLivro(int clienteid, String nomecliente, int livroid, String nomelivro) {
        this.clienteid = clienteid;
        this.nomecliente = nomecliente;
        this.livroid = livroid;
        this.nomelivro = nomelivro;
    }

    public ReservaLivro(int idreserva, int clienteid, String nomecliente, int livroid, String nomelivro) {
        this.idreserva = idreserva;
        this.clienteid = clienteid;
        this.nomecliente = nomecliente;
        this.livroid = livroid;
        this.nomelivro = nomelivro;
    }
    public ReservaLivro() {}

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getLivroid() {
        return livroid;
    }

    public void setLivroid(int livroid) {
        this.livroid = livroid;
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

}
