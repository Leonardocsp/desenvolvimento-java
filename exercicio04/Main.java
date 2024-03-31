import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        // Exemplo de uso da classe Jogador
        Jogador jogador1 = new Jogador("Carlos", 0, 1);
        jogador1.exibirInformacoes();

        jogador1.aumentarPontuacao(100);
        jogador1.subirNivel();
        jogador1.exibirInformacoes();
    }
}
