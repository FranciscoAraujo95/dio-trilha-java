package apps;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Acessando AWS e fazendo upload do histórico de mensagens");
    }

}
