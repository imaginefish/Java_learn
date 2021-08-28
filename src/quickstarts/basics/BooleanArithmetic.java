package quickstarts.basics;

/**
 * @author liwei
 * @date 2021/8/7
 **/
public class BooleanArithmetic {
    public static void main(String[] args) {
        basics();
        shortCircuit();
        ternaryOperator();
    }

    /**
     * 基本运算
     */
    public static void basics() {
        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age > 6 && age < 18; // true
    }

    /**
     * 短路运算
     */
    public static void shortCircuit() {
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
    }

    /**
     * 三元运算符
     */
    public static void ternaryOperator() {
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);
    }
}
