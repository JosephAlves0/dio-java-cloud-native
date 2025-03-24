import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.00;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor: " + valorDoce + " Adicionado ao carrinho\n");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gatou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
