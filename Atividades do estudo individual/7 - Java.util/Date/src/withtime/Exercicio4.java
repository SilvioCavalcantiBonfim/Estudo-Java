package withtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        LocalDate currentDate = LocalDate.now();

        LocalDate newDate = currentDate.plusDays(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.printf("Ao adicionar cinco dias a data %s tem-se %s.\n",
                currentDate.format(formatter), newDate.format(formatter));
    }

}
