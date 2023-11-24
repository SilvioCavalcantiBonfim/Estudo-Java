import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = "         Isael        Dorneles     Junior         ";
        
        System.out.println(semStream(nome));
        System.out.println(comStream(nome));
        System.out.println(comRegex(nome));

    }

    public static String semStream(String nome){

        String[] nomeSeparadoPorEspaco =  nome.split(" ");
        String nomeAtual = "";

        for (int i = 0; i < nomeSeparadoPorEspaco.length; i++) {
            String nomeAtualProcessado = nomeSeparadoPorEspaco[i];
            if (!nomeAtualProcessado.isBlank()) {
                nomeAtual =  nomeAtual.concat(nomeAtualProcessado);
                if (i < nomeSeparadoPorEspaco.length) {
                    nomeAtual = nomeAtual.concat(" ");
                }
            }
        }

        return nomeAtual;
    }
    
    public static String comRegex(String nome){
        String nomeTratado = nome;
        nomeTratado = nomeTratado.replaceAll("^\s+|\s+$", ""); // remove os espaços do começo e do fim
        nomeTratado = nomeTratado.replaceAll("\\s+", " "); // remove os espaços do meio
        return nomeTratado;
    }

    public static String comStream(String nome) {
        
        String nomeTratado = Arrays.asList(nome.split(" ")) //converte o array de strings da separacao em uma ArrayList
        .stream() //Converte a ArrayList em uma Stream
        .filter((e) -> !e.isBlank()) //Remove os textos em branco
        .collect(Collectors.joining(" ")); //coloca espaço entre os nomes restantes

        return nomeTratado;
    }
}
