/**
 * Created by Administrator
 * 2016/12/8
 */
// 利用递归方法求5! = 5*4*3*2*1 = 5*4!   4!=4*3*2*1   1! = 1
public class E22 { // Shift * 2

    long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        E22 e22 = new E22();
        System.out.println("10! = " + e22.factorial(20));
    }
}
