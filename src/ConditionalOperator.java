/**
 * Created by Administrator
 * 2016/12/6
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int z = (x < y) ? x * y : x / y; // (true/false)?true value:false value

        System.out.println(z);
    }
}
