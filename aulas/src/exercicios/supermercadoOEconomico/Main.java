package exercicios.supermercadoOEconomico;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("c1","Bruna", "Donadel");
        Cliente cliente2 = new Cliente("c2","Pedro", "Thome");
        Cliente cliente3 = new Cliente("c3","Thiago", "Sordi");
        List<Cliente> listaClientes = new ArrayList(Arrays.asList(cliente1, cliente2, cliente3));

        mostrarTodosClientes(listaClientes);

        excluirClietnePorId(listaClientes, "c2");

        mostrarTodosClientes(listaClientes);

        String idCliente;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nInsira o ID de um cliente para mostrar seus dados ou 'sair' para encerrar o programa");
            idCliente = sc.nextLine();
            if (idCliente.toLowerCase(Locale.ROOT).equals("sair")) {
                break;
            }
            mostrarClientePorId(listaClientes, idCliente);
        }
    }

    private static void mostrarTodosClientes(List<Cliente> clientes) {
        System.out.println("Lista de clientes atual: ");
        clientes.forEach(System.out::println);
    }

    private static boolean excluirClietnePorId(List<Cliente> clientes,String id) {
        boolean conseguiuExcluir = clientes.removeIf(cliente -> (cliente.getID().equals(id)));
        System.out.println(conseguiuExcluir ? "Cliente excluído com sucesso." : "Cliente não excluido.");
        return conseguiuExcluir;
    }

    private static void mostrarClientePorId(List<Cliente> clientes,String id) {
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getID().equals(id)).findFirst();
        if (cliente.isEmpty()) {
            System.out.println("Infelizmente não foi possível encontrar um cliente com o ID: " + id);
        } else {
            System.out.println(cliente.toString());
        }
    }
}
