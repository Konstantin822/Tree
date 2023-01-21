package tree.binary;

import java.util.Iterator;
import java.util.Stack;

public class Depth<V> implements Iterator<V> {
    private Stack<BinaryNode<V>> stack = new Stack<>();
    public Depth(BinaryNode<V> root) {
        stack.push(root);
    }
    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public V next() {
        BinaryNode<V> top = stack.pop();
        if (top.getRight() != null) {
            stack.push(top.getRight());
        }
        if (top.getLeft() != null) {
            stack.push(top.getLeft());
        }
        return top.getValue();
    }
}
