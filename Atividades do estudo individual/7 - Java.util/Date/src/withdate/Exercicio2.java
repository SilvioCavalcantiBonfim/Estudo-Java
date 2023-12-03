package withdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        // o construtor Date(String) está em deprecate desdo JDK 1.1 então o ideal é
        // utilizar a classe SimpleDateFormat.
        Date currentDate = new Date(System.currentTimeMillis());

        String currentDateInString = currentDate.toString();

        Date reConverte = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse(currentDateInString);
        
        System.out.println(reConverte.toString());
    }

}
