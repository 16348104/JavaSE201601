/**
 * Created by Administrator
 * 2016/12/9
 */

public class Vehicle { // 交通工具
    double speed;
    String color;
    double price;
    double weight;

    public Vehicle() {
        System.out.println("vehicle constructor...");
    }

    public Vehicle(double speed, String color, double price, double weight) {
        this.speed = speed;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    void run() {
        System.out.println("run...");
    }

    void stop() {
        System.out.println("stopped...");
    }
}
