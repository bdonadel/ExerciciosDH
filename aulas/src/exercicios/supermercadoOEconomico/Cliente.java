package exercicios.supermercadoOEconomico;

public class Cliente {
    private String ID;
    private String nome;
    private String sobrenome;

    public Cliente() {}

    public Cliente(String ID, String nome, String sobrenome) {
        this.ID = ID;
        this.nome = nome;
        this.sobrenome =sobrenome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
