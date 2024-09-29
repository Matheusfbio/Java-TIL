package Emcapsulamento;

public class Telegran {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegran");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegran");
    }
    private void validarConectadoInternet() {
        System.out.println("Validanddo se esta conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
