package primitivos.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrimitivosExercicios {
    public static void main(String[] args) {

        String name = "Matheus";
        String address = "Rua são josé";
        double salary = 2500.56D;
        LocalDateTime FormattedDate = LocalDateTime.now();
        String date = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(FormattedDate);

        System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de "+ salary+", na data "+ date+".");
    }
}
