package exercicios.mod2prat5.exercicio1.interfaces;

public class Pagamento implements Transacao {
    public void fazerPagamentoServico() {
        System.out.println("Fazendo pagamento de serviço.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Pagamento ok.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Pagamento NÃO ok.");
    }
}
