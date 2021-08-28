package quickstarts.basics;

/**
 * @author liwei
 * @date 2021/8/7
 **/
public class FloatArithmetic {
    public static void main(String[] args) {
        floatDeviation();
        typeUp();
        overflow();
        forcedConversion();
    }

    /**
     * 浮点数运算误差
     */
    public static void floatDeviation() {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);
        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            // 可以认为相等
        } else {
            // 不相等
        }
    }

    /**
     * 类型提升
     */
    public static void typeUp() {
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        d = 1.2 + 24 / 5; // 5.2
        System.out.println(d);
    }

    /**
     * 溢出
     */
    public static void overflow() {
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
    }

    /**
     * 强制转型
     */
    public static void forcedConversion(){
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n3 = (int) -12.7; // -12
        int n4 = (int) (12.7 + 0.5); // 13
        int n5 = (int) 1.2e20; // 2147483647
    }
}
