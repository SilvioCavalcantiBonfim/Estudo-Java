package withdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        // o construtor Date(String) está em deprecate desdo JDK 1.1 então o ideal é
        // utilizar a classe SimpleDateFormat.
        String date = "01/01/2000";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date currentDate = simpleDateFormat.parse(date);

        String formatToStringCurrentDate = new SimpleDateFormat("dd-MM-yyyy").format(currentDate);
        
        System.out.printf("A data especificada: %s.\n",formatToStringCurrentDate);
    }
}
