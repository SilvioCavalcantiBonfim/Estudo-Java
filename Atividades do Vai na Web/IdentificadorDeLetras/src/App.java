import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String vogais = "aAeEiIoOuU";
        boolean verification = false;
        Scanner sc = new Scanner(System.in);

        char letra = sc.next().charAt(0);

        verification = vogais.contains(Character.toString(letra));

        System.out.println((verification)?"É uma vogal.":"É uma consoante.");

        sc.close();
    }
}
