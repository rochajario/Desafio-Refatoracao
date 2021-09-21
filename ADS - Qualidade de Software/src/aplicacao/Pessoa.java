package aplicacao;

public class Pessoa {
    private int cartao;
    private String nome;
    private String sobrenome;
    private double valor;

    public int getCartao() {
        return cartao;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getValor() {
        return valor;
    }

    public Pessoa(int cartao, String nome, String sobrenome, double valor) {
        this.cartao = cartao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valor = valor;
    }

}
