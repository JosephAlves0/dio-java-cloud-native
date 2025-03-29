import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo valor ");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        } catch (ParamentrosInvalidosException e) {
            System.err.println("O segunda parametro deve ser maior que o primeiro");
        }finally {
            scanner.close();
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParamentrosInvalidosException {

        if (primeiroParametro > segundoParametro) {
            throw new ParamentrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Números: " + i);
        }

    }
}
