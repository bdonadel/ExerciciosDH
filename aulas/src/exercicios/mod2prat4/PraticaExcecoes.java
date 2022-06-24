package exercicios.mod2prat4;

public class PraticaExcecoes {

    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        /*try {
            System.out.println(b/a);
        } catch (ArithmeticException exception) {
            System.out.println("Ocorreu um erro");
        }*/
        if (a == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        } else {
            System.out.println(b/a);
        }
    }
}
