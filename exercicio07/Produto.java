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

    // Método para adicionar um novo produto ao estoque
    public static void adicionarProduto(String nome, String codigo, double preco, int estoque) {
        Produto novoProduto = new Produto(nome, codigo, preco, estoque);
        estoqueProdutos.put(codigo, novoProduto);
        System.out.println("Produto adicionado ao estoque: " + nome);
    }

    // Método para atualizar as informações de um produto existente no estoque
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

    // Método para remover um produto do estoque
    public static void removerProduto(String codigo) {
        if (estoqueProdutos.containsKey(codigo)) {
            Produto produtoRemovido = estoqueProdutos.remove(codigo);
            System.out.println("Produto removido do estoque: " + produtoRemovido.getNome());
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    // Método para gerar um relatório sobre o estoque atual
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

    // Getters e Setters omitidos para brevidade
}