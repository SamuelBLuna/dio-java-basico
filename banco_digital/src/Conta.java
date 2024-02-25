public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


 
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transfeir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void infoConta() {
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Número %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }
}