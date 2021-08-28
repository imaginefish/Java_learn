package quickstarts.basics;

/**
 * @author liwei
 * @date 2021/8/7
 **/
public class ArrayType {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        // 5位同学的成绩:
        int[] ns = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns.length); // 编译器自动推算数组大小为5
        int n = 5;
        System.out.println(ns[n]); // 索引n不能超出范围
    }

    public static void test2() {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        // s是"XYZ"还是"cat"?
        System.out.println(s);
    }
}
