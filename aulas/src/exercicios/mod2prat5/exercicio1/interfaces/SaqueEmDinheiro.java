package exercicios.mod2prat5.exercicio1.interfaces;

public class SaqueEmDinheiro implements Transacao{
    public void fazerSaque() {
        System.out.println("Fazendo saque em dinheiro.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Saque ok.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque NÃO ok.");
    }
}
