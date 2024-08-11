import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

import java.util.Locale;
import java.util.Scanner;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ServicoMensagemInstantanea smi = null;

        System.out.print("Informe o programa escolhido: ");
        String appEscolhido = scanner.nextLine();

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        System.out.println();
        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistoricoMensagem();

    }
}
