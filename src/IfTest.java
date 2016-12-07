import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/12/6
 */
public class IfTest {

    // [90,100] A
    // [80,90) B
    // [60,80) C
    // [0,60) D
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 60) {
            System.out.println("C");
        } else if (grade >= 0) {
            System.out.println("D");
        }

        String level = "A";
        // out [90,100]

        if(grade > 100) {
            System.out.println("> 100...");
        }

        if (grade > 100) {
            // Ctrl + Alt + t
        }

        if (grade > 100) {

        }
    }
}
