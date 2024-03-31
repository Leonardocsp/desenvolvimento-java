import java.util.Scanner;

public class Livro {
    // Atributos da classe Livro
    private String titulo;
    private String autor;
    private int ano;
    
    // Construtor para inicializar os atributos
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    // Método para exibir as informações do livro na tela
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
    
    // Método getter para o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método setter para o título do livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método getter para o autor do livro
    public String getAutor() {
        return autor;
    }

    // Método setter para o autor do livro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método getter para o ano do livro
    public int getAno() {
        return ano;
    }

    // Método setter para o ano do livro
    public void setAno(int ano) {
        this.ano = ano;
    }
}