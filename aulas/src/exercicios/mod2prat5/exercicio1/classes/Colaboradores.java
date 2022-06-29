package exercicios.mod2prat5.exercicio1.classes;

import exercicios.mod2prat5.exercicio1.interfaces.Consulta;
import exercicios.mod2prat5.exercicio1.interfaces.SaqueEmDinheiro;

public class Colaboradores {
    public static void main(String[] args) {
        SaqueEmDinheiro saqueEmDinheiro = new SaqueEmDinheiro();
        Consulta consulta = new Consulta();

        saqueEmDinheiro.fazerSaque();
        consulta.consultarSaldo();
    }
}
