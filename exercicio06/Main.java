import java.util.List;

public class Main {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda();

        Contato contato1 = new Contato("Fulano", "123456789");
        Contato contato2 = new Contato("Ciclano", "987654321");
        Contato contato3 = new Contato("Beltrano", "555555555");

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);
        minhaAgenda.adicionarContato(contato3);

        List<Contato> contatosEncontrados = minhaAgenda.buscarContatoPorNome("Fulano");
      
        System.out.println("Contatos encontrados:");
        for (Contato contato : contatosEncontrados) {
            System.out.println(contato);
        }
    }
}
