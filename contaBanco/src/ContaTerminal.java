import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        var scan = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao nosso sistema bancário!");
        System.out.println("\nPor Favor, digite seu nome!");
        String nomeCliente = scan.next();
        
        System.out.println("\nPor favor, digite a agência!");
        String agencia = scan.next();

        System.out.println("\nPor favor, digite o número da conta!");
        int numero = scan.nextInt();

        System.out.println("\nPor favor, digite o saldo da conta!");
        double saldo = scan.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo de R$:" + saldo + " já está disponível para saque.");
        scan.close();

    }
}
