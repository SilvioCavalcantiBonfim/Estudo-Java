import java.util.function.Function;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        float number = 2.0f;

        Function<Float, Float> square = ((n) -> n*n);

        System.out.println(square.apply(number));
    }
}
