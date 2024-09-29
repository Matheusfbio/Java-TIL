package abstração;

public class notebook {

    public static void main(String[] args) {
        ServicoMensagem servicoMensagem = null;

        String servicoEscolhido = "telegran";

        if (servicoEscolhido.equals("msn"))
            servicoMensagem = new MSNMessenger();
        else if (servicoEscolhido.equals("facebook"))
            servicoMensagem = new FacebookMessenger();
        else if (servicoEscolhido.equals("telegran"))
            servicoMensagem = new Telegran();

        servicoMensagem.enviarMessagem();
        servicoMensagem.receberMessagem();

    }
}
