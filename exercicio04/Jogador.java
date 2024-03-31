public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    // Construtor
    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    // Método para aumentar a pontuação do jogador
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação aumentada em " + pontos + ". Nova pontuação: " + pontuacao);
        } else {
            System.out.println("Valor de pontuação inválido.");
        }
    }

    // Método para subir de nível do jogador
    public void subirNivel() {
        nivel++;
        System.out.println("Jogador subiu para o nível " + nivel);
    }

    // Método para exibir as informações do jogador
    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    // Métodos para obter o nome, pontuação e nível do jogador
    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}