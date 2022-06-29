package exercicios.mod2prat5.exercicio1.classes;

import exercicios.mod2prat5.exercicio1.interfaces.Consulta;
import exercicios.mod2prat5.exercicio1.interfaces.Pagamento;
import exercicios.mod2prat5.exercicio1.interfaces.SaqueEmDinheiro;

public class Basico {

    public void pagarServico(){
        System.out.println("Pagando serviço");
    }

    public static void main(String[] args) {
        Consulta consulta = new Consulta();
        Pagamento pagamento = new Pagamento();
        SaqueEmDinheiro saqueEmDinheiro = new SaqueEmDinheiro();

        consulta.consultarSaldo();
        pagamento.fazerPagamentoServico();
        saqueEmDinheiro.fazerSaque();
    }
}
