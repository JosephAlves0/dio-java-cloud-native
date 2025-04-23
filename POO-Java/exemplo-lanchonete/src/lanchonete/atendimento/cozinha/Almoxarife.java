package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAÍDA DOS ITENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTRGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() { System.out.println("ALMOXARIFE TROCANDO O GÁS"); }
}
