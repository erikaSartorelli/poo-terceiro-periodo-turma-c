package SegundoBimestre.lista2;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + "Nome: " + nome + ", Preço: R$ " + preco + "]";
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
} 
