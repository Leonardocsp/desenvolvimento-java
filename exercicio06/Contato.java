import java.util.ArrayList;
import java.util.List;

// Classe Contato
class Contato {
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}