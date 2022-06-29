package exercicios.mod2prat5.exercicio2;

import java.util.Arrays;

public class Main implements Imprimiveis {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo(new Pessoa("Bruna"), Arrays.asList(new Habilidades("teste"),
                new Habilidades("teste2")));
        Imprimiveis.imprimirDocumentos(curriculo);

        LivroPDF livro = new LivroPDF("Bruna", "Livro teste", 155, "Ficção");
        Imprimiveis.imprimirDocumentos(livro);

        Relatorio relatorio = new Relatorio("texxxto", "Bruna", "Fulano", 25);
        Imprimiveis.imprimirDocumentos(relatorio);
    }
}
