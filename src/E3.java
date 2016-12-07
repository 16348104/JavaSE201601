/**
 * Created by Administrator
 * 2016/12/7
 */
// 打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个“水仙花数’，因为 153 = 1^3＋5^3＋3^3
public class E3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            // 123
            int b = i / 100;
            int s = ;
            int g = ;
            if (i == b*b*b + s*s*s + g*g*g) {
                System.out.println(i);
            }
        }
    }
}
