package exercicios.mod2prat5.exercicio1.interfaces;

public class Deposito implements Transacao {
    public void fazerDeposito() {
        System.out.println("Fazendo depósito.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Depósito ok.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Depósito NÃO ok.");
    }
}
