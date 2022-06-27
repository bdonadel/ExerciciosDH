package exercicios.mod2prat4;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double novoPreco = super.calcular(quantidadeDeProdutos);
        if (diasParaVencer == 1) {
            novoPreco *= (1.0 /4);
        } else if (diasParaVencer == 2) {
            novoPreco *= (1.0 /3);
        } else if (diasParaVencer == 3) {
            novoPreco *= (1.0 /2);
        }
        return novoPreco;
    }
}
