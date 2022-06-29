package exercicios.mod2prat5.exercicio2;

import java.util.List;

public class Curriculo extends Documento {
    Pessoa pessoa;
    List<Habilidades> habilidadesList;

    public Curriculo(Pessoa pessoa, List<Habilidades> habilidadesList) {
        this.pessoa = pessoa;
        this.habilidadesList = habilidadesList;
        tipoDocumento = "Curriculo";
    }

    @Override
    public String toString() {
        return "{" +
                "pessoa=" + pessoa +
                ", \nhabilidadesList=" + habilidadesList +
                '}';
    }
}
