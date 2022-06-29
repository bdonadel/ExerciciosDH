package exercicios.mod2prat5.exercicio2;

public interface Imprimiveis {
    static void imprimirDocumentos(Documento documento) {
        System.out.println("Imprimindo " + documento.tipoDocumento + "\n" + documento.toString());
    }
}
