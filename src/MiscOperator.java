/**
 * Created by Administrator
 * 2016/12/6
 */
public class MiscOperator {
    public static void main(String[] args) {
        char c = '中';
        int i = c;
        System.out.println(i);

        int j = 100000;
        char x = (char) j; // 强制类型转换是有风险的
        System.out.println((int) x); // a:97 d

        int z = (1 + 2) * 3 / (4 % 6);
        System.out.println(z); // 2
    }
}
