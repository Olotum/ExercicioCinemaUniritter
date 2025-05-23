package Obj;

public class Filme {
    String titulo;
    String genro;
    int deracao;
    Diretor diretor;

    public Filme(String titulo, String genro, int deracao, Diretor diretor) {
        this.titulo = titulo;
        this.genro = genro;
        this.deracao = deracao;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenro() {
        return genro;
    }

    public void setGenro(String genro) {
        this.genro = genro;
    }

    public int getDeracao() {
        return deracao;
    }

    public void setDeracao(int deracao) {
        this.deracao = deracao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", genro='" + genro + '\'' +
                ", deracao=" + deracao +
                ", diretor=" + diretor +
                '}';
    }
}
