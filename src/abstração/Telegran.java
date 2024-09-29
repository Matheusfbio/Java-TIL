package abstração;

public class Telegran extends ServicoMensagem {

    @Override
    public void enviarMessagem() {
        System.out.println("Enviando menssagem pelo telegran");
    }

    @Override
    public void receberMessagem() {
        System.out.println("Recebendo menssagem pelo telegran");

    }
}
