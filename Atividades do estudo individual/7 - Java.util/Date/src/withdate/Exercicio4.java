package withdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        Date currentDate = new Date(System.currentTimeMillis());

        Date fiveDayAdd = new Date(currentDate.getTime() + 5 * 86400000);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.printf("Ao adicionar cinco dias a data %s tem-se %s.\n",
                simpleDateFormat.format(currentDate), simpleDateFormat.format(fiveDayAdd));
    }

}
