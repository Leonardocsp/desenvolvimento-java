import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Bem-vindo à calculadora simples em Java!");
        System.out.print("Por favor, digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor, digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número correspondente à operação desejada: ");
        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = calculadora.adicao(num1, num2);
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = calculadora.subtracao(num1, num2);
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicacao(num1, num2);
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                try {
                    resultado = calculadora.divisao(num1, num2);
                    System.out.println("O resultado da divisão é: " + resultado);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
