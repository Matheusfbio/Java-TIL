package polimorfismo.domain;

public abstract class ServicoMensagem {
    public abstract void enviarMessagem();
    public abstract void receberMessagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }
}
