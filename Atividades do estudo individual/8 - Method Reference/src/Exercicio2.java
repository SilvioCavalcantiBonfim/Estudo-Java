import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        
        Random rng = new Random();

        List<Integer> numeros = new ArrayList<>(10);
        
        for (int i = 0; i < 10; i++) {
            numeros.add(i,rng.nextInt(100));
        }

        Integer max = numeros.stream().reduce(Integer.MIN_VALUE, Math::max);
        
        System.out.println("Lista: "+numeros);
        System.out.println("Máximo: "+max);
    }
}
