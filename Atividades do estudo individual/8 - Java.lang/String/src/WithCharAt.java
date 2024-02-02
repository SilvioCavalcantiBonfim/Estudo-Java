
public class WithCharAt {
    public static void main(String[] args) throws Exception {
        String text = "Ame o Ema";
        String reverseText = reverse(text);

        System.out.printf("Texto original : %s\nTexto invertido: %s\n", text, reverseText);
    }

    private static String reverse(String text) {
        StringBuilder reverseText = new StringBuilder();
        reverseText.setLength(text.length());

        for (int i = (text.length()-1)/2; i >= 0; i--) {
            reverseText.setCharAt(text.length() - i - 1, text.charAt(i));
            reverseText.setCharAt(i, text.charAt(text.length() - i - 1));
        }
        return reverseText.toString();
    }
}
