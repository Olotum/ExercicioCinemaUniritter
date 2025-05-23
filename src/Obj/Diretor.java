package Obj;

public class Diretor extends Pessoa{
    String nacionalidade;
    int quantidadePremios;

    public Diretor(String nome, int anoNascimento, String nacionalidade, int quantidadePremios) {
        super(nome, anoNascimento);
        this.nacionalidade = nacionalidade;
        this.quantidadePremios = quantidadePremios;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(int quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nacionalidade='" + nacionalidade + '\'' +
                ", quantidadePremios=" + quantidadePremios +
                ", nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }
}
