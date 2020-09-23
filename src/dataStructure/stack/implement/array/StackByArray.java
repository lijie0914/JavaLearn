package dataStructure.stack.implement.array;

/**
 * 栈功能实现，基于数组的结构
 */
public class StackByArray<T> {
    /**
     * 栈内元素
     */
    private Object[] value;
    /**
     * 栈顶位置
     */
    private int top;
    /**
     * 栈最大容量
     */
    private int maxSize;

    /**
     * 无参构造函数，默认栈容量大小
     */
    public StackByArray() throws Exception {
        this(10);
    }

    /**
     * 有参构造函数，参数设置栈容量大小，初始化栈内元素数组大小，初始化栈顶位置
     *
     * @param maxSize 栈最大容量
     */
    public StackByArray(int maxSize) throws Exception {
        if (maxSize <= 0) {
            throw new Exception("栈容量大小必须大于0");
        } else {
            this.top = -1;
            this.maxSize = maxSize;
            this.value = new Object[maxSize];
        }
    }

    /**
     * 入栈操作
     * 在数组中添加一个值，并将栈顶位置下标 + 1
     *
     * @param t 入栈元素
     */
    public void push(T t) throws Exception {
        if (top == maxSize - 1) {
            throw new Exception("入栈失败，栈已满");
        } else {
            value[++top] = t;
        }
    }

    /**
     * 出栈操作
     * 删除数组内栈顶元素，并将栈顶位置下标 - 1
     *
     * @return 出栈元素
     */
    public T pop() throws Exception {
        if (top <= -1) {
            throw new Exception("出栈失败，栈已空");
        } else {
            T t = (T) value[top];
            value[top--] = null;
            return t;
        }
    }

    /**
     * 查询栈顶数据
     *
     * @return 栈顶元素
     */
    public T peep() throws Exception {
        if (top <= -1) {
            throw new Exception("当前栈为空");
        } else {
            return (T) value[top];
        }
    }
}
