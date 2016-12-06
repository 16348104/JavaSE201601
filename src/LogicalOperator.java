/**
 * Created by Administrator
 * 2016/12/6
 */
public class LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2); // false
        System.out.println(b1 | b2); // true
        System.out.println(b1 ^ b2); // 异或 true
        System.out.println(b1 && b2); // false
        System.out.println(b1 || b2); // true
        System.out.println(!b1); // false
        System.out.println(!b2); // true

//        System.out.println(true & true);
//        System.out.println(true && true);

        int x = 1;
        int y = 2;

//        System.out.println((x > y) & (y++ > 0));
//        System.out.println(y);
        System.out.println((x > y) && (y++ > 0));
        System.out.println(y);

    }
}
