import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Pizza> cardapio = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        adicionarPizzas();

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    realizarPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    exibirRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    private static void adicionarPizzas() {

        cardapio.add(new Pizza("Mussarela", 25.0, List.of("Mussarela", "Tomate", "Orégano")));
        cardapio.add(new Pizza("Calabresa", 30.0, List.of("Calabresa", "Mussarela", "Cebola")));
        cardapio.add(new Pizza("Frango com Catupiry", 35.0, List.of("Frango", "Catupiry", "Milho")));
    }

    private static void exibirMenu() {
        System.out.println("\n------ Menu ------");
        System.out.println("1. Realizar Pedido");
        System.out.println("2. Cancelar Pedido");
        System.out.println("3. Exibir Relatório de Pedidos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void realizarPedido() {
        System.out.println("\n------ Realizar Pedido ------");
        exibirCardapio();

        System.out.print("Escolha o número do sabor desejado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        if (escolha < 1 || escolha > cardapio.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Pizza pizzaEscolhida = cardapio.get(escolha - 1);
        System.out.print("Tamanho da pizza (Pequena/Média/Grande): ");
        String tamanho = scanner.nextLine();

        System.out.print("Endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();

        double valor = pizzaEscolhida.getPreco();

        Pedido pedido = new Pedido(pizzaEscolhida, tamanho, valor, enderecoEntrega);
        pedidos.add(pedido);

        System.out.println("Pedido realizado com sucesso!");
    }
    private static void cancelarPedido() {
        System.out.println("\n------ Cancelar Pedido ------");
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para cancelar.");
            return;
        }
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". " + pedidos.get(i).getPizza().getNome());
        }
        System.out.print("Escolha o número do pedido a ser cancelado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        if (escolha < 1 || escolha > pedidos.size()) {
            System.out.println("Opção inválida.");
            return;
        }
        pedidos.remove(escolha - 1);
        System.out.println("Pedido cancelado com sucesso!");
    }

  private static void exibirRelatorio() {
      System.out.println("\n------ Relatório de Pedidos ------");
      if (pedidos.isEmpty()) {
          System.out.println("Não há pedidos realizados.");
          return;
      }

      System.out.println("Total de pedidos realizados: " + pedidos.size());
      double somaValores = 0;
      for (Pedido pedido : pedidos) {
          somaValores += pedido.getValor();
      }
      double mediaValores = somaValores / pedidos.size();
      System.out.println("Média de preço dos pedidos: " + mediaValores);

      System.out.println("\nDetalhes dos Pedidos:");
      for (int i = 0; i < pedidos.size(); i++) {
          Pedido pedido = pedidos.get(i);
          System.out.println("Pedido " + (i + 1) + ":");
          System.out.println("  Pizza: " + pedido.getPizza().getNome());
          System.out.println("  Tamanho: " + pedido.getTamanho());
          System.out.println("  Valor: " + pedido.getValor());
          System.out.println("  Endereço de Entrega: " + pedido.getEnderecoEntrega());
          System.out.println();
      }
  }
    private static void exibirCardapio() {
        System.out.println("\n------ Cardápio ------");
        for (int i = 0; i < cardapio.size(); i++) {
            Pizza pizza = cardapio.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$" + pizza.getPreco());
        }
    }
}
