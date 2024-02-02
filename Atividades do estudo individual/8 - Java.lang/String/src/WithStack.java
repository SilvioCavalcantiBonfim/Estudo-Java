import java.util.Stack;

public class WithStack {
    public static void main(String[] args) throws Exception {
        String text = "Ame o Ema";
        String reverseText = reverse(text);

        System.out.printf("Texto original : %s\nTexto invertido: %s\n", text, reverseText);
    }

    private static String reverse(String text) {
        StringBuilder reverseText = new StringBuilder();

        Stack<Character> charStackText = new Stack<>();
        
        for (char character : text.toCharArray()) {
            charStackText.add(character);
        }

        while (!charStackText.isEmpty()) {
            reverseText.append(charStackText.pop());
        }
        return reverseText.toString();
    }
}
