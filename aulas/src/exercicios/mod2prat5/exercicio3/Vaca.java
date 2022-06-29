package exercicios.mod2prat5.exercicio3;

public class Vaca extends Animal implements Herbivoros {
    @Override
    public void emitirSom() {
        System.out.println("Mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto");
    }
}
