import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o numero da Agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o nome do Titular da Conta: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o Saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero + " e seu saldo " + saldo + ", ja está disponivel para saque."
        );

    }
}
