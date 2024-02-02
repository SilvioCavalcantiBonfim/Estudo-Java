import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        long total = 20000000;

        for (int i = 0; i < total; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start, end;

        start = System.currentTimeMillis();

        arrayList.add((int) (total/2), -1);

        end = System.currentTimeMillis();

        System.out.println(end - start);
        
        start = System.currentTimeMillis();

        linkedList.add((int) (total/2), -1);

        end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
