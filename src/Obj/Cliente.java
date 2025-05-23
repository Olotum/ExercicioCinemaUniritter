package Obj;

public class Cliente extends Pessoa {
    String cpf;
    String endereco;

    public Cliente(String nome, int anoNascimento, String cpf, String endereco) {
        super(nome, anoNascimento);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }
}
