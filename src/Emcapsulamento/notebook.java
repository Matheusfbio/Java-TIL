package Emcapsulamento;

public class notebook {

    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

//        FacebookMessenger facebook = new FacebookMessenger();
//        facebook.enviarMensagem();
//        facebook.receberMensagem();
//
//        Telegran telegran = new Telegran();
//        telegran.enviarMensagem();
//        telegran.receberMensagem();
    }
}
