import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import search.BinarySearch;
import search.LinearSearch;
import search.Search;
import sort.Quick;

public class App {

    private static Random rng = new Random();

    private final static int SEARCH_VALUE = rng.nextInt();

    private static final int AMOUNT = 10000000;

    private static List<Integer> list = new LinkedList<Integer>();
    public static void main(String[] args) throws Exception {
        populeList();
        
        System.out.println("Ordenando lista...");

        list = Quick.<Integer>builder().sort(list);

        System.out.printf("Número %d foi colocado na posição %d para ser buscado.\n",SEARCH_VALUE, list.indexOf(SEARCH_VALUE));

        linear(list);

        binary(list);
    }

    private static void populeList() {
        int indexSearch;

        for (int i = 0; i < AMOUNT; i++) {
            int nextInt;
            do {
                nextInt = rng.nextInt();
            } while (nextInt == SEARCH_VALUE);
            list.add(nextInt);
        }
        indexSearch = (int) Math.abs(Math.round(rng.nextFloat()*AMOUNT));
        list.set(indexSearch, SEARCH_VALUE);

        System.out.printf("Lista iniciada com %d elementos.\n", list.size());
    }

    private static void linear(List<?> list) {

        Search lSearch = LinearSearch.builder();

        Long start = System.currentTimeMillis();

        int result = lSearch.search(list, SEARCH_VALUE);

        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "Linear", result);
    }

    private static void binary(List<Integer> list) {

        BinarySearch<Integer> bSearch = BinarySearch.builder();

        Long start = System.currentTimeMillis();

        int result = bSearch.search(list, SEARCH_VALUE);

        Long stop = System.currentTimeMillis();

        Double dt = (stop - start) / 1000.0d;

        printTime(dt, "Binary", result);
    }

    private static void printTime(Double dt, String alg, int result) {
        System.out.printf("\nTempo de busca para %s search: %.3fs\nPosição do elemento: %d\n", alg, dt, result);
    }
}
