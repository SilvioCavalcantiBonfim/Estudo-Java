import java.util.Random;

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
        
        System.out.println(tree);

        System.out.printf("O elemento %d%s pertênce.\n", 1, tree.search(1)? "":" não");
        System.out.printf("O elemento %d%s pertênce.\n", 6, tree.search(6)? "":" não");

        Random rng = new Random();

        BinaryTree<Integer> tree2 = new BinaryTree<Integer>(rng.nextInt());
        for (int i = 0; i < 1000000; i++) {
            tree2.insert(rng.nextInt());
        }
        System.out.println(tree2);
    }
}
