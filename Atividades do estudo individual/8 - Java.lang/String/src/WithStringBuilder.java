
public class WithStringBuilder {
    public static void main(String[] args) throws Exception {
        String text = "Ame o Ema";
        String reverseText = reverse(text);

        System.out.printf("Texto original : %s\nTexto invertido: %s\n", text, reverseText);
    }

    private static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
