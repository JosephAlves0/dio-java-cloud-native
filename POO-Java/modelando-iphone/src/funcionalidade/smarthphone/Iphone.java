package funcionalidade.smarthphone;

import funcionalidade.navegador.NavegadorInternet;
import funcionalidade.reprodutor.ReprodutorMusical;
import funcionalidade.telefone.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {
    @Override
    public void exibirPagina(String website) {
        System.out.println("Exibindo a página: " + website);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para o número: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
