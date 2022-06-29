package exercicios.mod2prat5.exercicio3;

public class Cachorro extends Animal implements Carnivoros {
    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne.");
    }
}
