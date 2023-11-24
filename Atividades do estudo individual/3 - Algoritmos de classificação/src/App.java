import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import sort.*;

public class App {

    private static List<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) throws Exception {

        populeList();

        bubble(list);

        selection(list);

        insertion(list);

        quick(list);
    }

    private static void populeList() {
        Random rng = new Random();

        for (int i = 0; i < 100000; i++) {
            list.add(rng.nextInt());
        }

        System.out.printf("Lista iniciada com %d elementos.\n", list.size());
    }

    private static void bubble(List<Integer> list) {
        Bubble<Integer> bSort = Bubble.<Integer>builder();

        Long start = System.currentTimeMillis();

        bSort.sort(list);

        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "Bubble   ");
    }

    private static void selection(List<Integer> list) {

        Selection<Integer> sSort = Selection.<Integer>builder();

        Long start = System.currentTimeMillis();

        sSort.sort(list);

        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "Selection");
    }

    private static void insertion(List<Integer> list) {

        Insertion<Integer> iSort = Insertion.<Integer>builder();
        
        
        Long start = System.currentTimeMillis();
        
        iSort.sort(list);


        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "Insertion");
    }

    private static void quick(List<Integer> list) {

        Quick<Integer> qSort = Quick.<Integer>builder();

        Long start = System.currentTimeMillis();
        
        qSort.sort(list);

        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "quick    ");
    }

    private static void printTime(Double dt, String alg) {
        System.out.printf("Tempo de ordenação para %s sort: %.3fs\n", alg, dt);
    }
}
