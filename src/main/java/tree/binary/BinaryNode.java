package tree.binary;

import java.util.Iterator;

public class BinaryNode<V> implements Iterable<V> {
    private V value;
    private BinaryNode<V> left;
    private BinaryNode<V> right;

    public BinaryNode(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public BinaryNode<V> getLeft() {
        return left;
    }

    public BinaryNode<V> getRight() {
        return right;
    }

    public void setLeft(BinaryNode<V> left) {
        this.left = left;
    }

    public void setRight(BinaryNode<V> right) {
        this.right = right;
    }

    @Override
    public Iterator<V> iterator() {
        return new Depth<>(this);
    }
}
