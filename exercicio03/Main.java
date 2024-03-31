import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
      
        System.out.println("Informe o nome do titular:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println("Saldo atual: R$" + conta.getSaldo());

        scanner.close();
    }
}
