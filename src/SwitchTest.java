import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/12/6
 */
public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input grade level: ");
        String level = scanner.nextLine();

        switch (level) {
            case "A":
                System.out.println("[90,100]");
                break;
            case "B":
                System.out.println("[80, 90)");
                break;
            case "C":
                System.out.println("[60, 80)");
                break;
            case "D":
                System.out.println("[0, 600");
                break;
            default:
                System.out.println("error.");
                break;
        }
    }
}
