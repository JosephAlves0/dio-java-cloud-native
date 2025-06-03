package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroConta(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Bento", 123456);
        agendaContatos.adicionarContato("Bento", 0);
        agendaContatos.adicionarContato("Bento do Pão", 11111111);
        agendaContatos.adicionarContato("Bento DIO", 654987);
        agendaContatos.adicionarContato("Fulano Silva", 11111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Bento"));

        System.out.println("Contato Atualizado " + agendaContatos.atualizarNumeroConta("Fulano Silva", 55555));
        agendaContatos.exibirContato();


    }

}
