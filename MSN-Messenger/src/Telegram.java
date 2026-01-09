public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem via Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Telegram");
    }
    
}
