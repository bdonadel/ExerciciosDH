package exercicios.mod2prat5.exercicio3;

public class Gato extends Animal  implements Carnivoros {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne.");
    }
}
