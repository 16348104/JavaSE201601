import org.ietf.jgss.Oid;

import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/12/8
 */
// 斐波那契数列：1，1，2, 3，5，8, 13, 21, 34,...，求f(n)
    /*
    递归调用 Recursive call
            F(n) = 1 (n=1, n=2)
            F(n) = F(n-1) + F(n-2) (n>2)
     */
public class E51 { // Ctrl + Alt + L

//    void method() {
//        method();
//    }

    private int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // asdf
        System.out.println("input n: ");
        int n = scanner.nextInt();

        E51 e51 = new E51();
        System.out.println("F(" + n + ") = " + e51.fibonacci(n));
    }
}
