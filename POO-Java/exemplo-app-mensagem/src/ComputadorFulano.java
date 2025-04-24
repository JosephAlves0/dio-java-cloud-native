import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantane;
import apps.Telegram;

public class ComputadorFulano {

    public static void main(String[] args) {
        /*System.out.println("MSN");
        apps.MSNMessenger msn = new apps.MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook");
        apps.FacebookMessenger fc = new apps.FacebookMessenger();
        fc.enviarMensagem();
        fc.receberMensagem();

        System.out.println("\napps.Telegram");
        apps.Telegram tl = new apps.Telegram();
        tl.enviarMensagem();
        tl.receberMensagem();*/

        ServicoMensagemInstantane smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
