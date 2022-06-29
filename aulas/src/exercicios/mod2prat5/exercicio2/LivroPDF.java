package exercicios.mod2prat5.exercicio2;

public class LivroPDF extends TextoAutoral {
    private String genero;
    protected String titulo;

    public LivroPDF(String autor, String titulo, int numeroPaginas, String genero) {
        super(autor, numeroPaginas);
        this.titulo = titulo;
        this.genero = genero;
        this.tipoDocumento = "LivroPDF";
    }

    @Override
    public String toString() {
        return "{" +
                "numeroPaginas=" + this.numeroPaginas +
                ", nomeAutor='" + this.nomeAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
