/**
 * Created by Administrator
 * 2016/12/5
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        byte aByte = -128; // [-128,127]
        char c = 10000;
        short s = -30000;
        int i = -400000000;
        long aLong = -40000L; // int

        float f = 1.2f; // double
        double d = 5D;

        System.out.println(b);
        System.out.println(aByte);
        System.out.println(c);
        System.out.println(s); // Shift + Ctrl + Enter
        System.out.println(i);
        System.out.println(aLong);
        System.out.println(f);
        System.out.println(d);

        System.out.println(Byte.MIN_VALUE + "," + Byte.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE + "," + (int)Character.MAX_VALUE );
        System.out.println(Short.MIN_VALUE + "," + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);

        byte age; // 年龄
    }
}
