import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        String[] nomes = { "Lucas", "Maria", "Pedro", "Ana", "João", "Beatriz", "Gabriel", "Fernanda",
                "Rafael", "Juliana" };

        System.out.println("Antes da ordenação: "+Arrays.asList(nomes));
        
        Arrays.sort(nomes, String::compareTo);

        System.out.println("Depois da ordenação: "+Arrays.asList(nomes));
        
    }
}
