import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Conta conta = new Conta();
    var scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o seu Nome:");
    conta.nome = scanner.next();

    System.out.println("Agora, digite o número da Agência:");
    conta.agencia = scanner.next();

    System.out.println("Agora, digite o número da Conta:");
    conta.numero = scanner.nextInt();

    System.out.println("Para finalizar, digite o valor de depósito:");
    conta.saldo = scanner.nextBigDecimal();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência" +
            " é %s, conta %s e seu saldo %.2f%n já está disponível para saque\n", conta.nome, conta.agencia, conta.numero, conta.saldo);
    }
}