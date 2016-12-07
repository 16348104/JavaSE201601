/**
 * Created by Administrator
 * 2016/12/7
 */
public class ForTest {
    public static void main(String[] args) {
        long start = System.nanoTime();
//        int result = 0;
        for (int j = 0; j < 10; j *= 3) {
//            result += (j + 1);
            if (j == 5) {
//                break; // 中断
                continue;
            }
            System.out.println(j);
        } // i j k
//        System.out.println(result);
        System.out.println("total time: " + (System.nanoTime() - start));
    }
}
