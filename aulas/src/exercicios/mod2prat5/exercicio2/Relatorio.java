package exercicios.mod2prat5.exercicio2;

public class Relatorio extends TextoAutoral {
    private String texto; //comprimento n?
    private String nomeRevisor;

    public Relatorio(String texto, String nomeAutor, String nomeRevisor, int numeroPaginas) {
        super(nomeAutor, numeroPaginas);
        this.texto = texto;
        this.nomeRevisor = nomeRevisor;
        this.tipoDocumento = "Relatório";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNomeRevisor() {
        return nomeRevisor;
    }

    public void setNomeRevisor(String nomeRevisor) {
        this.nomeRevisor = nomeRevisor;
    }

    @Override
    public String toString() {
        return "{" +
                "texto='" + texto + '\'' +
                ", nomeRevisor='" + nomeRevisor + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
