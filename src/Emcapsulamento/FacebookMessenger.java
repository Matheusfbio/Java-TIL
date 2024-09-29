package Emcapsulamento;

public class FacebookMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
    private void validarConectadoInternet() {
        System.out.println("Validanddo se esta conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
