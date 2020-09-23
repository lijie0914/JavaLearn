package dataStructure.stack.implement.linked;

/**
 * 栈内节点数据
 */
public class Node {
    /**
     * 节点的数据
     */
    private Object value;
    /**
     * 下一个节点
     */
    private Node next;

    public Node(Object value) {
        this(value, null);
    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
