package exercicios.supermercadoOEconomico;

public class Item {
    private String codigo;
    private String nome;
    private int qtddComprada;
    private double precoUnitario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtddComprada() {
        return qtddComprada;
    }

    public void setQtddComprada(int qtddComprada) {
        this.qtddComprada = qtddComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
