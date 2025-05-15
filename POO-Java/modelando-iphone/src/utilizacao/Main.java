package utilizacao;

import funcionalidade.smarthphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("===Reprodutor Musical===");
        iphone.tocarMusica("Ten Little Indians");
        iphone.pausarMusica();
        iphone.selecionarMusica();

        System.out.println("===Aparelho Telefonico===");
        iphone.ligar("005566997744");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("===Navegador Internet===");
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
