public class Relacionais {

  public static void main(String[] args) {
    // Operadores Relacionais: >, >=, <, <=, ==, !=
    int number1 = 10;
    int number2 = 20;
    
    boolean isMoreThat = number1 > number2;   // false
    boolean isMoreAndEqualThat = number1 >= number2;  // false
    boolean isLessThat = number1 < number2;  // false
    boolean isLessAndThat = number1 <= number2;  // false
    boolean isEqualThat = number1 == number2;  // false
    boolean isDifferent = number1 != number2; // true
    

    System.out.println("Is More That: " + isMoreThat);
    System.out.println("Is More And Equal That: " + isMoreAndEqualThat);
    System.out.println("Is Less That: " + isLessThat);
    System.out.println("Is Less And That: " + isLessAndThat);
    System.out.println("Is Equal That: " + isEqualThat);
    System.out.println("Is Different: " + isDifferent);

  }
}