package br.csi.projeto_POO_Final.model;

public class Reserva {

    private int id;
    private int clienteid;
    private int livroid;


    public Reserva(int id, int clienteid, int livroid) {
        this.id = id;
        this.clienteid = clienteid;
        this.livroid = livroid;
    }

    public Reserva(){}

    public int getId() {
        return id;
    }

    public void setId(int idreserva) {
        this.id = id;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getLivroid() {
        return livroid;
    }

    public void setLivroid(int livroid) {
        this.livroid = livroid;
    }
}
