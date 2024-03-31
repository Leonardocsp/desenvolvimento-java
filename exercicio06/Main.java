import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        // Exemplo de uso da classe Agenda e Contato
        Agenda minhaAgenda = new Agenda();

        // Adicionando contatos
        Contato contato1 = new Contato("Fulano", "123456789");
        Contato contato2 = new Contato("Ciclano", "987654321");
        Contato contato3 = new Contato("Beltrano", "555555555");

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);
        minhaAgenda.adicionarContato(contato3);

        // Buscando contatos por nome
        List<Contato> contatosEncontrados = minhaAgenda.buscarContatoPorNome("Fulano");

        // Exibindo contatos encontrados
        System.out.println("Contatos encontrados:");
        for (Contato contato : contatosEncontrados) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }
}
