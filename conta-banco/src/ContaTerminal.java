import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o número da Conta: ");
        int conta = scanner.nextInt();   

        scanner.nextLine();

        System.out.println("Informe o seu Nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo "+ saldo +" já está disponível para saque");
    }
}
