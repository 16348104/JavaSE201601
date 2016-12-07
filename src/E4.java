import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/12/7
 */
// 将一个正整数分解质因数
// 例如：输入90，打印出 90 = 2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input N: ");
        int n = scanner.nextInt();

        System.out.print(n + " = ");
        boolean b = true;
        while (n != 1) {
            for (int i = 2; i < n + 1; i++) {
                if (n % i == 0) {
                    if (b) {
                        System.out.print(i);
                        b = false;
                    } else {
                        System.out.print(" * " + i);
                    }
                    n /= i;
                    break;
                }
            }
        }
    }
}
