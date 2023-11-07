import java.util.Random;

import Fila.Fila;
import ListaVinculada.ListaVinculada;
import Pilha.Pilha;

public class App {
    private static final int TOTAL_ENTRADAS = 10;

    public static void main(String[] args) throws Exception {
        lista();
        pilha();
        fila();
    }

    private static void pilha() {
        titulo("Pilha");

        Pilha<Float> pilha = Pilha.<Float>builder();

        Random rng = new Random();

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            pilha.push(rng.nextFloat());
            System.out.println(String.format("Foi adicionado %.2f a pilha", pilha.observe()));
        }

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            System.out.println(String.format("O item %.2f vai ser removido da pilha", pilha.observe()));
            pilha.pop();
        }
    }

    private static void lista() {

        titulo("Lista");

        ListaVinculada<Integer> lista = ListaVinculada.<Integer>builder();

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            lista.adicionar(i*10);
        }

        System.out.println("Antes da remoção: "+lista);

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            if(i%2 == 0)
                lista.remover(i*10);
        }

        System.out.println("Depois da remoção: "+lista);
    }

    private static void fila() {
        titulo("fila");

        Fila<Integer> pilha = Fila.<Integer>builder();

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            pilha.enqueue(i);
            System.out.println(String.format("O item %d foi adicionado a fila.", i));
        }
        
        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            System.out.println(String.format("O item %d foi removido da fila.", pilha.dequeue()));
        }
    }


    private static void titulo(String titulo){
        System.out.println(String.format("-------------------------------------------------------------------------------------\n%s\n-------------------------------------------------------------------------------------", titulo));
    }
}
