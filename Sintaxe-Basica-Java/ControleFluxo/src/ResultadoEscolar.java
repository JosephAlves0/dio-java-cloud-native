public class ResultadoEscolar {

    public static void main(String[] args) {

        // if - else if - else
        /*int nota = 10;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }*/

        //condição ternária simples
        /*int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);*/


        //condição ternária composta
        int nota = 10;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}
