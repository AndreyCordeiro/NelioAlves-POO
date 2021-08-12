package application;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "=-=-=-=-=-=-=-=-=" +
                "\nNome: " + nome +
                String.format("\nPreço: %.2f", preco) +
                "\nQuantidade: " + quantidade +
                String.format("\nValor Total no Estoque: %.2f", valorTotalEstoque());
    }
}