import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Bem vindo ao Sistema Bancário ===");
        System.out.println("\nInforme o número da conta para cadastro: ");
        String numeroConta = scanner.nextLine();
        System.out.println("\nInforme o valor depositado: ");
        double valorDeposito = scanner.nextDouble();

        Conta conta = new Conta(numeroConta, valorDeposito);

        int opcao;

        do {
            System.out.println("\n=== Operações ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro ");
            System.out.println("4 - Sacar Dinheiro ");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar utilização do Cheque Especial");
            System.out.println("0 - Sair do Sistema");
            System.out.println("\nEscolha a operação desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 :
                    conta.getSaldo();
                    break;
                case 2 :
                    conta.getChequeEspecial();
                    break;
                case 3 :
                    System.out.println("Digite o valor do deposito: ");
                    double valorNovoDeposito = scanner.nextDouble();
                    conta.depositar(valorNovoDeposito);
                    System.out.println("Deposito realizado com sucesso!");
                    break;
                case 4 :
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    boolean sacou = conta.sacar(valorSaque);
                    if(sacou) {
                        System.out.println("Valor sacado com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente para saque");
                    }
                    break;
                case 5 :
                    System.out.println("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    boolean pagouBoleto = conta.pagarBoleto(valorBoleto);
                    if(pagouBoleto) {
                        System.out.println("Boleto pago com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente para pagamento");
                    }
                    break;
                case 6 :
                    conta.isUtilizandoChequeEspecial();
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
