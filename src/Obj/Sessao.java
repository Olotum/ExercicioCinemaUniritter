package Obj;

public class Sessao {
    String data;
    String hora;
    Sala sala;
    Filme filme;

    public Sessao(String data, String hora, Sala sala, Filme filme) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.filme = filme;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", sala=" + sala +
                ", filme=" + filme +
                '}';
    }
}
