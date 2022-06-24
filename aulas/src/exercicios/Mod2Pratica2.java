package exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mod2Pratica2 {
    public static int numeroInscricaoCircuitoPequeno = 0;
    public static int numeroInscricaoCircuitoMedio = 0;
    public static int numeroInscricaoCircuitoAvancado = 0;
    public static List<Participante> participantesCircuitoPequeno = new ArrayList<>();
    public static List<Participante> participantesCircuitoMedio = new ArrayList<>();
    public static List<Participante> participantesCircuitoAvancado = new ArrayList<>();

    public static HashMap<String, String> comandos = new HashMap<String, String>();
    public static HashMap<String, String> tipoCircuito = new HashMap<String, String>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        comandos.put("i", "Inscrever participante");
        comandos.put("m", "Mostrar inscritos");
        comandos.put("c", "Cancelar inscrição");
        comandos.put("e", "Encerrar o programa");
        tipoCircuito.put("p", "Circuito Pequeno");
        tipoCircuito.put("m", "Circuito Médio");
        tipoCircuito.put("a", "Circuito Avançado");
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("O que você deseja fazer? Digite o códiga da opção desejada.");
            for (String key: comandos.keySet()) {
                System.out.println(key + ": " + comandos.get(key));
            }
            String acao = sc.nextLine();
            while (!comandos.containsKey(acao)) {
                System.out.println("Código inválido, tente novamente:");
                acao = sc.nextLine();
            }
            if (acao.equals("i")) {
                String tipoCirc = selecionarTipoCircuitoValido();
                Participante novoParticipante = getParticipante();
                cadastrar(tipoCirc, novoParticipante);
            } else if (acao.equals("m")) {
                String tipoCirc = selecionarTipoCircuitoValido();
                mostrarTodosCadastrados(tipoCirc);
            } else if (acao.equals("c")) {
                String tipoCirc = selecionarTipoCircuitoValido();
                cancelarInscricao(tipoCirc);
            } else {
                continuar = false;
            }
        }
    }

    private static String selecionarTipoCircuitoValido() {
        System.out.println("Qual é o categoria que deja? Digite o códiga da opção desejada.");
        for (String key: tipoCircuito.keySet()) {
            System.out.println(key + ": " + tipoCircuito.get(key));
        }
        String circuitoSelecionado = sc.nextLine();
        while (!tipoCircuito.containsKey(circuitoSelecionado)) {
            System.out.println("Código inválido, tente novamente:");
            circuitoSelecionado = sc.nextLine();
        }
        return circuitoSelecionado;
    }

    private static Participante getParticipante(){
        Participante novoParticipante = new Participante();

        System.out.print("Digite o nome: ");
        novoParticipante.setNome(sc.nextLine());

        System.out.print("Digite o sobrenome: ");
        novoParticipante.setSobrenome(sc.nextLine());

        System.out.print("Digite o RG: ");
        novoParticipante.setRG(sc.nextLine());

        System.out.print("Digite a idade: ");
        novoParticipante.setIdade(Integer.parseInt(sc.nextLine()));

        System.out.print("Digite o número de celular: ");
        novoParticipante.setNumeroCelular(sc.nextLine());

        System.out.print("Digite o número de emergência: ");
        novoParticipante.setNumeroEmergencia(sc.nextLine());

        System.out.print("Digite o grupo sanguíneo: ");
        novoParticipante.setGrupoSanguineo(sc.nextLine());

        return novoParticipante;
    }

    private static void cadastrar(String tipoCircuito, Participante novoParticipante) {
        boolean cadastrou = false;
        if (tipoCircuito.equals("p")) {
            if (novoParticipante.getIdade() < 18) {
                novoParticipante.setValorInscricao(1300);
            } else {
                novoParticipante.setValorInscricao(1500);
            }
            novoParticipante.setNumeroInscricao(++numeroInscricaoCircuitoPequeno);
            cadastrou = participantesCircuitoPequeno.add(novoParticipante);
        } else if (tipoCircuito.equals("m")) {
            if (novoParticipante.getIdade() < 18) {
                novoParticipante.setValorInscricao(2000);
            } else {
                novoParticipante.setValorInscricao(2300);
            }
            novoParticipante.setNumeroInscricao(++numeroInscricaoCircuitoMedio);
            cadastrou = participantesCircuitoMedio.add(novoParticipante);
        } else {
            if (novoParticipante.getIdade() < 18) {
                System.out.println("Inscrição cancelada, pois o participante é menor de 18 anos.");
            } else {
                novoParticipante.setValorInscricao(2800);
                novoParticipante.setNumeroInscricao(++numeroInscricaoCircuitoAvancado);
                cadastrou = participantesCircuitoAvancado.add(novoParticipante);
            }
        }
        if (cadastrou) {
            System.out.println("Participante cadastrado com sucesso. Valor de inscrição R$" + novoParticipante.getValorInscricao());
        }
    }

    public static void mostrarTodosCadastrados(String tipoCircuito) {
        if (tipoCircuito.equals("p")) {
            System.out.println("Inscritos no circuito pequeno:");
            for (Participante part : participantesCircuitoPequeno) {
                System.out.println(part.getNome() + " - " + part.getIdade() + " anos. #Registro: " + part.getNumeroInscricao());
            }
        } else if (tipoCircuito.equals("m")) {
            System.out.println("Inscritos no circuito médio:");
            for (Participante part : participantesCircuitoMedio) {
                System.out.println(part.getNome() + " - " + part.getIdade() + " anos. #Registro: " + part.getNumeroInscricao());
            }
        } else {
            System.out.println("Inscritos no circuito avançado:");
            for (Participante part : participantesCircuitoAvancado) {
                System.out.println(part.getNome() + " - " + part.getIdade() + " anos. #Registro: " + part.getNumeroInscricao());
            }
        }
    }

    public static void cancelarInscricao(String tipoCircuito) {
        System.out.println("Qual é o categoria que deja? Digite o códiga da opção desejada.");
        int numeroInscricao = Integer.parseInt(sc.nextLine());
        boolean deletou;
        if (tipoCircuito.equals("p")){
            deletou = participantesCircuitoPequeno.removeIf(part -> part.getNumeroInscricao() == numeroInscricao);
        } else if (tipoCircuito.equals("m")) {
            deletou = participantesCircuitoMedio.removeIf(part -> part.getNumeroInscricao() == numeroInscricao);;
        } else {
            deletou = participantesCircuitoAvancado.removeIf(part -> part.getNumeroInscricao() == numeroInscricao);
        }
        if (deletou) {
            System.out.println("Cancelamento efetuado com sucesso.");
        } else {
            System.out.println("Nenhum parciticipante encontrado com esse número de incrição na categoria escolhida.");
        }
    }
}
