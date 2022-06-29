package exercicios.mod2prat5.exercicio1.interfaces;

public class Consulta implements Transacao {

    public void consultarSaldo() {
        System.out.println("Consultando saldo.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Consulta ok.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Consulta NÃO ok.");
    }
}
