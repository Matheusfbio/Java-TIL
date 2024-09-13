package debugging;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String[] student = {"Matheus", "Fabio", "Raimundo"};
      
      double middle = calculateMiddletClass(student, scan);

      System.out.printf("Middlet Class %.1f", middle);
    
    }

    static double calculateMiddletClass(String[] students, Scanner scanner) {
      double sum = 0;
      for(String student : students) {
        System.out.printf("nota do aluno %s: ", student);
        double nota = scanner.nextInt();
        sum += nota;
      }
      return sum / students.length;
    }
}
