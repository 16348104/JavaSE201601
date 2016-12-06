/**
 * Created by Administrator
 * 2016/12/6
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x); // 100
        x += 100; // x = x + 100;
        System.out.println(x); // 200
        x -= 100;
        System.out.println(x); // 100
        x *= 100;
        System.out.println(x); // 10000
        x /= 100;
        System.out.println(x); // 100
        x %= 100;
        System.out.println(x); // 0
        x ^= 100; // x = x & 100
//        0000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(0b1100100);
        System.out.println(x);

        boolean y = true;
        System.out.println(y); // true
        y &= false; // y = y & false
        System.out.println(y); // false
        y |= true;
        System.out.println(y); // true
        y ^= false;
        System.out.println(y); // true

//        二元赋值运算符
//        x ?= y 等价于 x = x ? y
    }
}
