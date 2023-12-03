package withtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        
        String date = LocalDate.now().toString();

        LocalDate currentDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String currentDateFormat = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.printf("A data especificada: %s.\n", currentDateFormat);
    }

}
