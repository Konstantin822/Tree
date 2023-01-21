package tree;

import tree.binary.BinaryNode;
import tree.binaryinsert.BinaryInsertTree;

public class main {
    public static void main(String[] args) {
        BinaryInsertTree<Integer> tree = new BinaryInsertTree<>();
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        System.out.println();


        BinaryNode<Integer> a = new BinaryNode<>(1);
        BinaryNode<Integer> b = new BinaryNode<>(2);
        BinaryNode<Integer> c = new BinaryNode<>(3);
        BinaryNode<Integer> d = new BinaryNode<>(4);
        BinaryNode<Integer> e = new BinaryNode<>(5);
        BinaryNode<Integer> f = new BinaryNode<>(6);
        BinaryNode<Integer> g = new BinaryNode<>(7);

        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);
        b.setRight(e);

        c.setLeft(f);
        c.setRight(g);

        for (Integer s : a) {
            System.out.printf("%s, ", s);
        }
    }
}
