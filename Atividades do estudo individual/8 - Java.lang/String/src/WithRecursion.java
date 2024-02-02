
public class WithRecursion {
    public static void main(String[] args) throws Exception {
        String text = "Ame o Ema";
        String textReverse = reverse(text);
        
        System.out.printf("Texto original : %s\nTexto invertido: %s\n", text, textReverse);
    }

    private static String reverse(String str){
        if (str == null || str.length()<= 1) {
            return str;
        }
        return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
    }
}
