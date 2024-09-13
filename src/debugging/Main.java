package debugging;

public class Main {
  public static void main(String[] args) {
    System.out.println("Started of program on method main");
    a();
    System.out.println("Finished of program on method main");
  }

  static void a() {
    System.out.println("Started of program on method a");
    for (int i = 0; i <= 4; i++) {
        System.out.println(i);
    }
    b();
    System.out.println("Finished of program on method a");
  }

  static void b() {
    System.out.println("Started of program on method b");
    // Thread.dumpStack();
    System.out.println("Finished of program on method b");
  }
}
