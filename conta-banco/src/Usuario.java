import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();
        conta.agencia(agencia);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        conta.numeroConta(numeroConta);
        scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        conta.nomeCliente(nomeCliente);

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        conta.saldo(saldo);

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo R$ "
                + String.format("%.2f", conta.saldo) + " já está disponível para saque.");

        scanner.close();
    }
    
}