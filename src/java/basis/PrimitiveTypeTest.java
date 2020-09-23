package java.basis;

/**
 * java基本类型
 */
public class PrimitiveTypeTest {
    public static void main(String[] args) {
        // byte 是字节数据类型 ，是有符号型的，占1 个字节；大小范围为-128—127 。
        // char 是字符数据类型 ，是无符号型的，占2字节(Unicode码 ）；大小范围 是0—65535 ；char是一个16位二进制的Unicode字符，JAVA用char来表示一个字符
        byte b1 = -1;
        byte b2 = 1;
        byte b3 = -128;
        byte b4 = 127;
        char c = (char) -3;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(c);
    }
}
