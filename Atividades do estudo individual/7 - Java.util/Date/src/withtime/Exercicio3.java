package withtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        LocalDate initialDate = LocalDate.of(2000, 1, 1);

        // na API time do java usa-se o metodo between do ChronoUnit para calcular
        // diferença entre periodos de tempo.
        Long diffInDays = ChronoUnit.DAYS.between(initialDate, LocalDate.now());

        String formatInitialDate = initialDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.printf("Se passaram %d dias desde %s.\n", diffInDays, formatInitialDate);

    }

}
