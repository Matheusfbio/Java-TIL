package challanges;

import java.util.Scanner;

public class HighestRated {

    public static void main(String[] args) {
        //INPUT DE DADOS DO USUARIO
        Scanner userInput = new Scanner(System.in);
        System.out.println("--- Calculador de media ---");
        //VAR PARA ARMAZENAR OS DADOS
        double nota1 = userInput.nextDouble();
        double nota2 = userInput.nextDouble();
        double nota3 = userInput.nextDouble();

        double media = (nota1 + nota2 + nota3 ) / 3;
        //MOSTRA OS DADOS
        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);


        if(media >= 7 ) {
            System.out.println("Parabens vc foi aprovado com media: " + media);
        } else if (media <= 6) {
            System.out.println("Infelizmente você esta em recuperação, sua media foi: " + media);
        }
    }
}
