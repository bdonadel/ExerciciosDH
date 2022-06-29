package exercicios.mod2prat5.exercicio2;

public class Habilidades {
    public String descricao;
    public Habilidades(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
