import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagem para o nosso usuário
        //Obter pela scanner os valores digitados pelo terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        int agencyNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente");
        String customerName = scanner.nextLine();

        System.out.println("Digite o saldo");
        BigDecimal accountBalance = scanner.nextBigDecimal();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %s já está disponível para saque", customerName, agencyNumber, accountNumber, accountBalance));

        scanner.close();
    }
}
