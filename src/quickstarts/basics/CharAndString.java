package quickstarts.basics;

/**
 * @author liwei
 * @date 2021/8/7
 **/
public class CharAndString {
    public static void main(String[] args) {
        charUnicode();
        concatenate();
        immutability();
    }

    /**
     * 获取字符对应的 Unicode 编码
     */
    public static void charUnicode(){
        char c1 = 'A';
        char c2 = '中';
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013
    }

    /**
     * 字符串拼接
     */
    public static void concatenate() {
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s);
    }

    /**
     * 字符串的不可变性
     */
    public static void immutability() {
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}
