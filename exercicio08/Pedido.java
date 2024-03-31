public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private double valor;
    private String enderecoEntrega;

    public Pedido(Pizza pizza, String tamanho, double valor, String enderecoEntrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.valor = valor;
        this.enderecoEntrega = enderecoEntrega;
    }
    public Pizza getPizza() {
        return pizza;
    }
    public String getTamanho() {
        return tamanho;
    }
    public double getValor() {
        return valor;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
}
