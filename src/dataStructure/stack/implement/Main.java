package dataStructure.stack.implement;

import dataStructure.stack.implement.array.StackByArray;
import dataStructure.stack.implement.linked.StackByLinked;

/**
 * @author Jerry
 */
public class Main {
    public static void main(String[] args) throws Exception {
        testStackByArray();
        testStackByLinked();
    }

    /**
     * 测试 基于数组实现的栈
     */
    public static void testStackByArray() throws Exception {
        System.out.println("----- 基于数组实现的栈 START -----");
        StackByArray stack = new StackByArray(15);
        stack.push("hello");
        stack.push("world");
        stack.push("world1");
        stack.push("world2");
        stack.push("world3");
        stack.push("world4");
        stack.push("world5");
        stack.push("world6");
        stack.push("world7");
        stack.push("world8");
        stack.push("world9");
        stack.push("world10");
        stack.push(123);
        // 获取栈顶元素
        System.out.println(stack.peep());
        // 移除栈顶元素并返回移除的元素
        System.out.println(stack.pop());
        // 获取栈顶元素
        System.out.println(stack.peep());
        System.out.println("----- 基于数组实现的栈 END -----");
    }

    /**
     * 测试 基于链表实现的栈
     */
    public static void testStackByLinked() throws Exception {
        System.out.println("----- 基于链表实现的栈 START -----");
        StackByLinked stack = new StackByLinked(15);
        stack.push("hello");
        stack.push("world");
        stack.push("world1");
        stack.push("world2");
        stack.push("world3");
        stack.push("world4");
        stack.push("world5");
        stack.push("world6");
        stack.push("world7");
        stack.push("world8");
        stack.push("world9");
        stack.push("world10");
        stack.push(123);
        // 获取栈顶元素
        System.out.println(stack.peep());
        // 移除栈顶元素并返回移除的元素
        System.out.println(stack.pop());
        // 获取栈顶元素
        System.out.println(stack.peep());
        System.out.println("----- 基于链表实现的栈 END -----");
    }
}
