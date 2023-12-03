package withtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        
        String date = "01/01/2000";

        LocalDate currentDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String currentDateFormat = currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.printf("A data especificada: %s.\n",currentDateFormat);
    }
}
