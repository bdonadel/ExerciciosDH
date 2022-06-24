package exercicios.mod2prat4;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new NaoPereciveis("Notebook", 18499.90, "Informática"));
        listaProdutos.add(new Pereciveis("Pão", 6.5, 3));

        for (Produto produto : listaProdutos) {
            System.out.println(produto.getNome() + ", R$" + produto.calcular(5));
        }
    }
}
