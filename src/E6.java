import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/12/7
 */
// 输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m: ");
        int m = scanner.nextInt();
        System.out.println("input n: ");
        int n = scanner.nextInt();

        for (int j = m; j > 0; j--) {
            if (m % j == 0 && n % j == 0) {
                System.out.println(j);
                break;
            }
        }
        for (int j = m; j <= m*n; j++) {
            if (j % m == 0 && j % n == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}
