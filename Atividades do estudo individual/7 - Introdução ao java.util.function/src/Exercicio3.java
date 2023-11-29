import java.util.List;
import java.util.function.Function;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        List<Double> list = List.of(1.0,13.2,2.4,15.1,65.2,22.3);

        Function<List<Double>, Double> square = ((s) -> {
            return s.stream().reduce(0.0,(a,b) -> a+b);
        });

        System.out.println(square.apply(list));
    }
}
