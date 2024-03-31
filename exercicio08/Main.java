import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Pizza> cardapio = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        adicionarSabores();

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

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
                    adicionarSabores();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n------ Pizzaria ------");
        System.out.println("1. Realizar Pedido");
        System.out.println("2. Cancelar Pedido");
        System.out.println("3. Exibir Relatório de Pedidos");
        System.out.println("4. Adicionar Sabores ao Cardápio");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void realizarPedido() {
        System.out.println("\n------ Realizar Pedido ------");
        exibirCardapio();

        System.out.print("Escolha o número do sabor desejado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (escolha < 1 || escolha > cardapio.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Pizza pizzaEscolhida = cardapio.get(escolha - 1);

        System.out.print("Tamanho da pizza (Pequena/Média/Grande): ");
        String tamanho = scanner.nextLine();

        System.out.print("Valor da pizza: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();

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
            System.out.println((i + 1) + ". " + pedidos.get(i).getPizza().getNomePizza());
        }

        System.out.print("Escolha o número do pedido a ser cancelado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

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
            System.out.println("Pedido " + (i + 1));
            System.out.println("Pizza: " + pedido.getPizza().getNomePizza());
            System.out.println("Tamanho: " + pedido.getTamanho());
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("Endereço de Entrega: " + pedido.getEnderecoEntrega());
            System.out.println();
        }
    }

    private static void adicionarSabores() {
        cardapio.add(new Pizza("Mussarela", 30.0, List.of("Mussarela", "Tomate", "Orégano")));
        cardapio.add(new Pizza("Calabresa", 35.0, List.of("Calabresa", "Mussarela", "Cebola")));
        cardapio.add(new Pizza("Chocolate", 40.0, List.of("Chocolate", "Leite condensado")));

        System.out.println("Sabores adicionados ao cardápio com sucesso!");
   }
}