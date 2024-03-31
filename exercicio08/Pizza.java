import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {
    private String nomePizza;
    private double valor;
    private List<String> ingredientes;

    public Pizza(String nomePizza, double valor, List<String> ingredientes) {
        this.nomePizza = nomePizza;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}