package exercicios.mod2prat4;

public class Produto {
    private static String nome;
    private static double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Produto.nome = nome;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Produto.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double calcular(int quantidadeDeProdutos) {
        return quantidadeDeProdutos * preco;
    }
}
