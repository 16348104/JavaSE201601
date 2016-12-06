/**
 * Created by Administrator
 * 2016/12/6
 */
public class ArithmeticOperator { // F2 Alt + Enter
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int z = x + y;
        z = x - y;
        z = x * y;
        z = x / y; // *****
        System.out.println(z);

        System.out.println(1d / 2d);

//        x++; // x = x + 1;
//        System.out.println(x++);
//        System.out.println(x);

//        y--;
//        System.out.println(y--);
//        System.out.println(y);

//        System.out.println(x++);
//        System.out.println(++x);

        z = x % y;
        System.out.println(z);

        System.out.println(100 % 3);
    }
}
