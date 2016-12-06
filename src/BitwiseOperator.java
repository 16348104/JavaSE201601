/**
 * Created by Administrator
 * 2016/12/6
 */
public class BitwiseOperator { // 按位运算
    public static void main(String[] args) {
        int x = 0b11000011; // Ctrl + y
        int y = 0b10011001;

        System.out.println(Integer.toBinaryString(x & y)); // 0b10000001
        System.out.println(Integer.toBinaryString(x | y)); // 0b11011011
        System.out.println(Integer.toBinaryString(x ^ y)); // 0b1011010
        System.out.println(Integer.toBinaryString(~(-0b11))); // 0b00111100
        System.out.println(Integer.toBinaryString(x << 2)); // 0b1100001100
        System.out.println(Integer.toBinaryString(x >> 2)); // 0b110000

//        int j = 1000;
//        System.out.println(Integer.toBinaryString(j));
    }
}
