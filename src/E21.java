/**
 * Created by Administrator
 * 2016/12/8
 */
// 求1+2!+3!+…+20!的和
public class E21 { // Ctrl + n

    long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long sum = 0;
        E21 e21 = new E21();
        for (int i = 0; i < 21; i++) {
            sum += e21.factorial(i + 1);
        }
        System.out.println("sum: " + sum);
//        System.out.println(String.valueOf(Long.MAX_VALUE).length());
    }
}
