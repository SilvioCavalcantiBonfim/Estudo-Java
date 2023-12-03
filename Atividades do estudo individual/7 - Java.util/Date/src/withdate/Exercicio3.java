package withdate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        // Esse construtor esta em deprecated e para definir o ano inicia-se contando a
        // partir de 1900. Exemplo: para o ano de 2000 preciamos definir o campo year
        // como 100. Então o recomendado é usar a classe Calendar para esse tipo de
        // data.

        Calendar initialDatePartial = Calendar.getInstance();
        initialDatePartial.set(2000, Calendar.JANUARY, 1);

        Date initialDate = initialDatePartial.getTime();
        Date currentDate = new Date(System.currentTimeMillis());

        long diff = (currentDate.getTime() - initialDate.getTime()) / 86400000;

        String formatInitialDate = new SimpleDateFormat("dd-MM-yyyy").format(initialDate);
        System.out.printf("Se passaram %d dias desde %s.\n", diff, formatInitialDate);
    }

}
