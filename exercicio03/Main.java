import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(123456, "Fulano de Tal");
        System.out.println("Saldo inicial: " + minhaConta.getSaldo());

        minhaConta.depositar(1000);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());

        minhaConta.sacar(500);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());

        minhaConta.sacar(600); // Isso deve falhar, saldo insuficiente
        System.out.println("Saldo final: " + minhaConta.getSaldo());
    }
}
