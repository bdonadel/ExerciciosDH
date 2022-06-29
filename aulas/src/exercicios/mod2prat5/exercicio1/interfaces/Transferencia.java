package exercicios.mod2prat5.exercicio1.interfaces;

public class Transferencia implements Transacao {
    public void fazerTransferencia() {
        System.out.println("Fazendo transferência.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transferência ok.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferência NÃO ok.");
    }
}
