import java.util.function.Function;
import java.util.stream.Collectors;

import tree.impl.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<Integer>(2);
        
        tree.insertLeft(2, 7);
        tree.insertRight(2, 5);
        tree.insertRight(5, 9);
        tree.insertRight(9, 4);
        tree.insertLeft(7, 2);
        tree.insertRight(7, 6);
        tree.insertRight(6, 11);
        tree.insertLeft(6, 5);
        
        System.out.println("Representação por aninhamento: "+tree);

        print(2, tree);
        print(5, tree);
        print(50, tree);

        String leaf = tree.getAllLeaf().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(","));

        System.out.println("Folhas: " + leaf);

        String preOrder = tree.preOrder(Function.identity())
        .stream()
        .map(String::valueOf)
        .collect(Collectors.joining(","));
        
        System.out.println("Execução pre-ordem: " + preOrder);


        String inOrder = tree.inOrder(Function.identity())
        .stream()
        .map(String::valueOf)
        .collect(Collectors.joining(","));
        
        System.out.println("Execução in-ordem:  " + inOrder);

        String posOrder = tree.posOrder(Function.identity())
        .stream()
        .map(String::valueOf)
        .collect(Collectors.joining(","));
        
        System.out.println("Execução pos-ordem: " + posOrder);

        System.out.println("Profundidade do nó 4: "+tree.depth(4));
        System.out.println("Altura da árvore: "+tree.height());
    }

    public static void print(int value, BinaryTree<Integer> tree){
        System.out.printf("Niveis que o valor %d foi encontrado: %s\n",value,tree.search(value).toString());
    }
}
