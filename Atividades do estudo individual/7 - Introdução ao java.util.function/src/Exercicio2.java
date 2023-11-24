import java.util.function.Function;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        String text = "String de teste";

        Function<String, Integer> square = ((s) -> s.length());

        System.out.println(square.andThen((e) -> e*2).apply(text));
    }
}
