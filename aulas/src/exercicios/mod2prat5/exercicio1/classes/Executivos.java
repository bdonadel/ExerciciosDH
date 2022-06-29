package exercicios.mod2prat5.exercicio1.classes;

import exercicios.mod2prat5.exercicio1.interfaces.Deposito;
import exercicios.mod2prat5.exercicio1.interfaces.Transferencia;

public class Executivos {

    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Transferencia transferencia = new Transferencia();

        deposito.fazerDeposito();
        transferencia.fazerTransferencia();
    }

}
