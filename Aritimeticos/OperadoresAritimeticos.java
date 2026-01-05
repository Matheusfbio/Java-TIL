import java.text.DecimalFormat;

public class OperadoresAritimeticos {
  public static void main(String[] args) {
    // Operadores Aritméticos: +, -, *, /, %
    double number1 = 10;
    double number2 = 3.12;
    double sum = number1 + number2;
    double substract = number1 - number2;
    double multiply = number1 * number2;
    double divide = number1 / number2;
    double module = number1 % number2;

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    System.out.println(decimalFormat.format(sum));
    System.out.println(decimalFormat.format(substract));
    System.out.println(decimalFormat.format(multiply));
    System.out.println(decimalFormat.format(divide));
    System.out.println(decimalFormat.format(module));
  }
}
