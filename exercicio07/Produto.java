import java.util.HashMap;
import java.util.Map;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;
    private static Map<String, Produto> estoqueProdutos = new HashMap<>();

    public Produto(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }
    public static void adicionarProduto(String nome, String codigo, double preco, int estoque) {
        Produto novoProduto = new Produto(nome, codigo, preco, estoque);
        estoqueProdutos.put(codigo, novoProduto);
        System.out.println("Produto adicionado ao estoque: " + nome);
    }
    public static void atualizarProduto(String codigo, String novoNome, double novoPreco, int novoEstoque) {
        if (estoqueProdutos.containsKey(codigo)) {
            Produto produto = estoqueProdutos.get(codigo);
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            produto.setEstoque(novoEstoque);
            System.out.println("Produto atualizado com sucesso: " + novoNome);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
    public static void removerProduto(String codigo) {
        if (estoqueProdutos.containsKey(codigo)) {
            Produto produtoRemovido = estoqueProdutos.remove(codigo);
            System.out.println("Produto removido do estoque: " + produtoRemovido.getNome());
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
    public static void relatorioEstoque() {
        System.out.println("------ Relatório de Estoque ------");
        if (estoqueProdutos.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }
        double valorTotal = 0;
        for (Produto produto : estoqueProdutos.values()) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            valorTotal += produto.getPreco() * produto.getEstoque();
            System.out.println();
        }
        System.out.println("Valor Total em Estoque: R$" + valorTotal);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
