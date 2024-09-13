public class App {
    public static void main(String[] args) throws Exception {
        // @SuppressWarnings("resource")
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Olá, Seja bem vindo");
        // System.out.println("Qual o seu nome");
        // String name = scanner.nextLine();
        // System.out.println("Prazer " + name );
        estruturaCondicional();
    }

    private static void estruturaCondicional() {
        int real = 5;
        int dolar = 1;

        if (dolar == 1) {
            System.out.println("O valor do Dolar convertido em Real é " + real);
        } 
       
        if (real == 5) {
            System.out.println("O valor do Real convertido em Dolar é " + dolar);
        } 

        // System.out.println("Valor Real " + real );
        // System.out.println("Valor Dolar " + dolar );
    }
}
