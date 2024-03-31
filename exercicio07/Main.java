import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Menu ------");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do Produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Estoque do Produto: ");
                    int estoque = scanner.nextInt();
                    Produto.adicionarProduto(nome, codigo, preco, estoque);
                    break;
                case 2:
                    System.out.print("Código do Produto a ser atualizado: ");
                    String codigoAtualizar = scanner.nextLine();
                    System.out.print("Novo Nome do Produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Preço do Produto: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Novo Estoque do Produto: ");
                    int novoEstoque = scanner.nextInt();
                    Produto.atualizarProduto(codigoAtualizar, novoNome, novoPreco, novoEstoque);
                    break;
                case 3:
                    System.out.print("Código do Produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();
                    Produto.removerProduto(codigoRemover);
                    break;
                case 4:
                    Produto.relatorioEstoque();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
