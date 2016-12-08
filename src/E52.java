/**
 * Created by Administrator
 * 2016/12/8
 */
// 求解汉诺塔 n 圆盘移动步骤
public class E52 {

    int counter;

    // n: 当前要移动的盘子的个数
    // src: 从 src 柱子
    // with: 利用 with 柱子
    // dest: 到 dest 柱子
    void hanoi(int n, String src, String with, String dest) {
        if (n == 1) {
            System.out.println(src + " - " + dest);
            counter++;
            return;
        }
        hanoi(n - 1, src, dest, with);
        System.out.println(src + " - " + dest);
        counter++;
        hanoi(n - 1, with, src, dest);
    }

    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(19, "A", "B", "C");
        System.out.println(e52.counter);
    }
}
