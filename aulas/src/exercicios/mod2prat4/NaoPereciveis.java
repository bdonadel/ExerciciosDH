package exercicios.mod2prat4;

public class NaoPereciveis extends Produto {
    public static String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        NaoPereciveis.tipo = tipo;
    }
}
