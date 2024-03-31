public class Main {
    public static void main(String[] args) {
    
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813);
        
        System.out.println("Informações do Livro 1:");
        livro1.exibirInfo();

        System.out.println("\nInformações do Livro 2:");
        livro2.exibirInfo();

        System.out.println("\nInformações do Livro 3:");
        livro3.exibirInfo();
    }
}
