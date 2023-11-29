import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        
        List<String> nomes = List.of("Lucas", "Maria", "Pedro", "Ana", "João", "Beatriz", "Gabriel", "Fernanda",
                "Rafael", "Juliana");

        nomes.forEach(System.out::println);
    }
}
