/**
 * Created by Administrator
 * 2016/12/8
 */
// 一个整数，加上100后是一个完全平方数，再加上168又是一个完全平方数
// 请问该数是多少？
public class E13 {

    public static void main(String[] args) {
//        int n; // n + 100 = x*x;   n + 268 = y*y

//        int i = 101;
//        System.out.println(String.valueOf(Math.sqrt(i)).endsWith(".0"));

        for (int n = -100; ; n++) {
            if (String.valueOf(Math.sqrt(n + 100)).endsWith(".0") && String.valueOf(Math.sqrt(n + 268)).endsWith(".0")) {
                System.out.println(n);
//                break;
            }
        }
    }
}
