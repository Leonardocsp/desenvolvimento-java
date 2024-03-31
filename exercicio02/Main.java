import java.util.Scanner;

public class Main
{
    // Método principal para teste
    public static void main(String[] args) {
        // Criando uma instância de Livro
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        
        // Exibindo as informações do livro
        livro.exibirInfo();
    }
}
