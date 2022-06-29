package exercicios.mod2prat6;

import java.util.List;

public class Garagem {
    private String id;
    private List<Veiculo> listVeiculos;

    public Garagem(String id, List<Veiculo> veiculos) {
        this.id = id;
        listVeiculos = veiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Veiculo> getListVeiculos() {
        return listVeiculos;
    }

    public void setListVeiculos(List<Veiculo> listVeiculos) {
        this.listVeiculos = listVeiculos;
    }
}
