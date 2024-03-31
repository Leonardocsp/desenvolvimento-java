import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "ABC1234");
        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50);
        meuCarro.frear(20);

        meuCarro.exibirInformacoes();
    }
}
