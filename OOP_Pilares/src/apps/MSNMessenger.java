package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Acessando a Nuvem e fazendo upload do histórico de mensagens.");
    }
}
