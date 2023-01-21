package tree.binaryinsert;


import java.util.Comparator;

public class BinaryInsertTree<V> {
    private Node<V> root;
    private Comparator<V> comparator;

    public BinaryInsertTree(Comparator<V> comparator) {
        this.comparator = comparator;
    }

    public BinaryInsertTree() {
    }

    public void insert(V value) {
        Node<V> valueNode = new Node<>(value);
        if (root == null) {
            root = valueNode;
            return;
        }

        Node<V> node = root;
        Node<V> parent;
        int comp;
        if (comparator != null) {
            do {
                parent = node;
                comp = comparator.compare(value, node.value);
                if (comp < 0) {
                    node = node.left;
                } else {
                    node = node.right;
                }

            } while (node != null);
        } else {
            Comparable<V> compVal = (Comparable<V>) value;
            do {
                parent = node;
                comp = compVal.compareTo(node.value);
                if (comp < 0) {
                    node = node.left;
                } else {
                    node = node.right;
                }

            } while (node != null);
        }

        if (comp < 0) {
            parent.left = valueNode;
        } else {
            parent.right = valueNode;
        }
    }
    private class Node<V> {
        V value;
        Node<V> left;
        Node<V> right;

        public Node(V value) {
            this.value = value;
        }
    }
}
