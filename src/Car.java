/**
 * Created by Administrator
 * 2016/12/9
 */
public class Car extends Vehicle {

    String powerType; // 动力类型
    int tireNumber; // 车轮个数

    public Car(double speed, String color, double price, double weight, String powerType, int tireNumber) {
        super(speed, color, price, weight);
        this.powerType = powerType;
        this.tireNumber = tireNumber;
    }

    // 隐式   显式

    Car() {
        // super();
    }

    void addOil() {

    }

    void charge() {

    }
}
