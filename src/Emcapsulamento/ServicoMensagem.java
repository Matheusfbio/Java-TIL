package Emcapsulamento;

public class ServicoMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validanddo se esta conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
