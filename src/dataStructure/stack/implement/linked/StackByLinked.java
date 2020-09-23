package dataStructure.stack.implement.linked;

/**
 * 栈功能实现，基于链表的结构
 */
public class StackByLinked {
    /**
     * 栈顶元素
     */
    private Node top;
    /**
     * 栈最大容量
     */
    private int maxSize;
    /**
     * 栈实际容量
     */
    private int size;

    public StackByLinked() throws Exception {
        this(10);
    }

    public StackByLinked(int maxSize) throws Exception {
        if (maxSize <= 0) {
            throw new Exception("栈容量大小必须大于0");
        }
        this.top = null;
        this.maxSize = maxSize;
        this.size = 0;
    }

    /**
     * 是否已达到栈最大容量
     *
     * @return true-是；false-否
     */
    public boolean ifFull() {
        return this.size >= this.maxSize;
    }

    /**
     * 栈是否为空
     *
     * @return true-是；false-否
     */
    public boolean isEmpty() {
        return this.size <= 0;
    }

    /**
     * 入栈
     *
     * @param value 入栈元素
     */
    public void push(Object value) throws Exception {
        if (this.ifFull()) {
            throw new Exception("入栈失败，栈已满");
        }
        size++;
        top = new Node(value, top);
    }

    /**
     * 出栈
     *
     * @return 出栈元素
     */
    public Node pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("出栈失败，栈已空");
        }
        Node node = top;
        top = top.getNext();
        size--;
        return node;
    }

    /**
     * 查询栈顶数据
     *
     * @return 栈顶元素
     */
    public Node peep() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("当前栈为空");
        }
        return top;
    }
}
