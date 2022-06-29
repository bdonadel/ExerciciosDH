package exercicios.mod2prat6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listVeiculos = Arrays.asList(
                new Veiculo("Fiesta","Ford",1000),
                new Veiculo("Focus","Ford",1200),
                new Veiculo("Explorer","Ford",2500),
                new Veiculo("Uno","Fiat",500),
                new Veiculo("Cronos","Fiat",1000),
                new Veiculo("Torino","Fiat",1250),
                new Veiculo("Aveo","Chevrolet",1250),
                new Veiculo("Spin","Chevrolet",2500),
                new Veiculo("Corola","Toyota",1200),
                new Veiculo("Fortuner","Toyota",3000),
                new Veiculo("Logan","Renault",950)
        );
        Garagem garagem = new Garagem("1", listVeiculos);

        System.out.println("Veículos ordenados por preço:");
        /*Collections.sort(listVeiculos, new ComparadorVeiculo());
        for (Veiculo v: listVeiculos){
            System.out.println(v.getModelo() + " R$" + v.getPreco());
        }*/

        /*listVeiculos.stream().sorted((x,y) -> x.getPreco() >= y.getPreco() ? 0 : -1).forEach(
                v -> System.out.println(v.getModelo() + " R$" + v.getPreco())
        );*/

        garagem.getListVeiculos().stream().sorted((a, b) -> (int)(a.getPreco() - b.getPreco())).forEach(
                v -> System.out.println(v.getModelo() + " R$" + v.getPreco())
        );

        System.out.println("\nVeículos ordenados por marca:");
        listVeiculos.stream().sorted((x,y) -> x.getMarca().compareTo(y.getMarca())).forEach(
                v -> System.out.println(v.getModelo() + " - " + v.getMarca() + " R$" + v.getPreco())
        );

        System.out.println("\nVeículos com preço não superior a R$1000:");
        List<Veiculo> listaVeiculosAte1000 = listVeiculos.stream().filter(v -> v.getPreco() <= 1000).collect(Collectors.toUnmodifiableList());
        for (Veiculo v: listaVeiculosAte1000) {
            System.out.println(v.getModelo() + " - " + v.getMarca() + " R$" + v.getPreco());
        }

        System.out.println("\nVeículos com preço maior do que ou igual a R$1000:");
        List<Veiculo> listaVeiculosMaior1000 = listVeiculos.stream().filter(v -> v.getPreco() >= 1000).collect(Collectors.toUnmodifiableList());
        for (Veiculo v: listaVeiculosMaior1000) {
            System.out.println(v.getModelo() + " - " + v.getMarca() + " R$" + v.getPreco());
        }

        double soma = listVeiculos.stream().mapToDouble(v -> v.getPreco()).average().getAsDouble();
        soma = Math.round(soma * 100) / 100.00;
        System.out.println("\nO preço médio dos veículos é: R$" + soma);
    }
}
