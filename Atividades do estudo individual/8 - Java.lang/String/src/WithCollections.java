import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WithCollections {
    public static void main(String[] args) throws Exception {
        String text = "Ame o Ema";
        String reverseText = reverse(text);

        System.out.printf("Texto original: %s\nTexto invertido: %s\n", text, reverseText);
    }

    private static String reverse(String text) {
        StringBuilder reverseText = new StringBuilder();
        text.chars()
        .mapToObj((e) -> (char)e)
        .collect(Collectors.collectingAndThen(Collectors.toList(), WithCollections::swap))
        .forEach(reverseText::append);
        return reverseText.toString();
    }

    public static <T> List<T> swap(List<T> e){
        Collections.reverse(e);
        return e;
    }
}
