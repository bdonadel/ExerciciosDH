package exercicios.mod2prat5.exercicio2;

public class TextoAutoral extends Documento {
    protected String nomeAutor;
    protected int numeroPaginas;

    public TextoAutoral(String nomeAutor, int numeroPaginas) {
        this.nomeAutor = nomeAutor;
        this.numeroPaginas = numeroPaginas;
    }
}
