public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0; // saldo inicial zero
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para retornar o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para retornar o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método para retornar o nome do titular da conta
    public String getNomeTitular() {
        return nomeTitular;
    }
}