public class Main {
    
    public static void main(String[] args) {

        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");

        Conta corrente = new ContaCorrente(samuel);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(samuel);
        corrente.transfeir(50.50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
