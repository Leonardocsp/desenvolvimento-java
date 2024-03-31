import java.util.List;

public class Pizza {
    private String nome;
    private double preco;
    private List<String> ingredientes;

    public Pizza(String nome, double preco, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
}
