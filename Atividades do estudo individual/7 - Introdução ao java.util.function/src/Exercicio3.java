import java.util.List;
import java.util.function.Function;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        List<Double> list = List.of(1.0,13.2,2.4,15.1,65.2,22.3);

        Function<List<Double>, Double> square = ((s) -> {
            Double value = 0.0;
            for (Double number : s) {
                value += number;
            }
            return value;
        });

        System.out.println(square.apply(list));
    }
}
