package Obj;

public class Compra {
    String data;
    double valor;
    String formaPagamento;
    Cliente cliente;
    Sessao sessao;
    Funcionario funcionario;

    public Compra(String data, double valor, String formaPagamento, Cliente cliente, Sessao sessao, Funcionario funcionario) {
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.sessao = sessao;
        this.funcionario = funcionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "data='" + data + '\'' +
                ", valor=" + valor +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", cliente=" + cliente +
                ", sessao=" + sessao +
                ", funcionario=" + funcionario +
                '}';
    }
}
