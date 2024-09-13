package exceptionsStructure;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Expections {

  public static void main(String[] args) {
    try {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o seu nome");
            String firstname = scanner.next();
            
            System.out.println("Digite o seu sobrenome");
            String lastname = scanner.next();
            
            System.out.println("Digite a sua idade");
            int age = scanner.nextInt();
            
            System.out.println("Ola, me chamo " + firstname + " " + lastname + ", minha idade é " + age);
        }
    } catch (InputMismatchException e){
      System.out.println("O campo idade tem que ser numerico, ex: 12, 22, 55, 105");
    } finally {
      System.out.println("---fim da execuçào---");
    }
  }
}
