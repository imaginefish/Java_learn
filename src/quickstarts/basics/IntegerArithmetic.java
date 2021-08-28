package quickstarts.basics;

/**
 * 整数运算
 *
 * @author liwei
 * @date 2021/8/7
 **/
public class IntegerArithmetic {

    public static void main(String[] args) {
        arithmetic();
        overflow();
        selfAddAndSub();
        bitMoveWithSign();
        bitMoveWithoutSign();
        bitArithmetic();
    }

    /**
     * 四则运算
     */
    public static void arithmetic() {
        // 3
        int i = (1 + 2) * (99 - 98);
        System.out.println(i);
    }

    /**
     * 溢出
     */
    public static void overflow() {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        // -2147483641
        System.out.println(sum);
    }

    /**
     * 自增自减
     */
    public static void selfAddAndSub() {
        int n = 0;
        // 1, 相当于 n = n + 1
        n++;
        System.out.println(n);
        // 0, 相当于 n = n - 1
        n--;
        System.out.println(n);
    }

    /**
     * 带符号位移运算
     */
    public static void bitMoveWithSign() {
        // 00000000 00000000 00000000 00000111 = 7
        int n = 7;
        // 00000000 00000000 00000000 00001110 = 14
        int a = n << 1;
        // 00000000 00000000 00000000 00011100 = 28
        int b = n << 2;
        // 01110000 00000000 00000000 00000000 = 1879048192
        int c = n << 28;
        // 11100000 00000000 00000000 00000000 = -536870912
        int d = n << 29;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    /**
     * 无符号位移运算
     */
    public static void bitMoveWithoutSign() {
        int n = -536870912;
        // 01110000 00000000 00000000 00000000 = 1879048192
        int a = n >>> 1;
        // 00111000 00000000 00000000 00000000 = 939524096
        int b = n >>> 2;
        // 00000000 00000000 00000000 00000111 = 7
        int c = n >>> 29;
        // 00000000 00000000 00000000 00000001 = 1
        int d = n >>> 31;
    }

    /**
     * 位运算
     */
    public static void bitArithmetic() {
        int i = 167776589; // 00001010 00000000 00010001 01001101
        int n = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & n); // 167776512
    }

    /**
     * 类型转换
     */
    public static void typeConversion() {
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
        //short y = s + i; // 编译错误!
        i = 12345;
        s = (short) i; // 12345
    }
}
