public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }
    public void acelerar(int aumentoVelocidade) {
        if (aumentoVelocidade > 0) {
            velocidadeAtual += aumentoVelocidade;
            System.out.println("Carro acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Aceleração inválida.");
        }
    }
    public void frear(int diminuicaoVelocidade) {
        if (diminuicaoVelocidade > 0 && diminuicaoVelocidade <= velocidadeAtual) {
            velocidadeAtual -= diminuicaoVelocidade;
            System.out.println("Carro freando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Diminuição de velocidade inválida ou impossível.");
        }
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
