import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Seja bem vindo");
        System.out.println("Qual o seu nome");
        String name = scanner.nextLine();
        System.out.println("Prazer " + name );

    }
}
