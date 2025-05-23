package Obj;

public class Sala {
    int identificacao;
    String tipo;
    int capacidade;

    public Sala(int identificacao, String tipo, int capacidade) {
        this.identificacao = identificacao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "identificacao=" + identificacao +
                ", tipo='" + tipo + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
