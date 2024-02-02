import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();

        long total = 20000000;

        for (int i = 0; i < total; i++) {
            list.add(i);
        }

        long start, end;

        start = System.currentTimeMillis();

        list.add((int) (total/2), -1);

        end = System.currentTimeMillis();

        System.out.println(end - start);
        
    }
}
