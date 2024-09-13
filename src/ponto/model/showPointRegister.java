package ponto.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class showPointRegister {
  
   public void showRegister() {
    LocalDateTime dataInRegister = LocalDateTime.now();
      DateTimeFormatter dataInFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String formattedDateIn = dataInRegister.format(dataInFormatted);
      System.out.println("Ponto registrado no relogio: " + formattedDateIn);  
  }
  
}