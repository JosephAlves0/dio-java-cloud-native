import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alô!!!");


        int numero = 1;
        for (int x=1; x<2; x++){ numero = numero + x; }
            System.out.println("O valor de número é: " + numero);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}
