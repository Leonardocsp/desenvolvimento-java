import java.util.ArrayList;
import java.util.List;

// Classe Agenda
public class Agenda {
    private List<Contato> contatos;

    // Construtor
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Método para adicionar novo contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Método para buscar contatos por nome
    public List<Contato> buscarContatoPorNome(String nome) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }
}