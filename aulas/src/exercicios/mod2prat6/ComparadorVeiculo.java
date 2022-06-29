package exercicios.mod2prat6;

import java.util.Comparator;

public class ComparadorVeiculo implements Comparator<Veiculo> {
    @Override
    public int compare(Veiculo v1, Veiculo v2) {
        if (v1.getPreco() == v2.getPreco()) {
            return 0;
        } else if (v1.getPreco() > v2.getPreco()) {
            return 1;
        } else {
            return -1;
        }


    }
}
