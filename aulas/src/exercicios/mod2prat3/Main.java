package exercicios.mod2prat3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<Integer, String> nivelPeso = new HashMap<>();

    public static void main(String[] args) {
        nivelPeso.put(-1, "Abaixo do peso.");
        nivelPeso.put(0, "Peso saudável.");
        nivelPeso.put(1, "Sobrepeso.");
        Pessoa pessoaSemParametros = new Pessoa();
        Pessoa pessoaComNomeIdadeID = new Pessoa("Bruna", 24, "bdonadel");
        Pessoa pessoaCompleta = new Pessoa("Bruna", 24, "bruna", 56, 1.63);

        // Pessoa pessoaComNomeIdade = new Pessoa("Bruna", 24);
        // não é possível iniciar pelo construtor com parametros faltando ou sobrando.

        int idNivelPeso = pessoaCompleta.calcularIMC();
        boolean ehMaiorIdade = pessoaCompleta.ehMaiorIdade();
        System.out.println("A pessoa está no nível de peso: " + nivelPeso.get(idNivelPeso));
        System.out.println(ehMaiorIdade? "A pessoa é maior de idade." : "A pessoa é menor de idade.");
        System.out.println(pessoaCompleta.toString());
    }
}
