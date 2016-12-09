/**
 * Created by Administrator
 * 2016/12/9
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10, "black", 500D, 10D);
        Car car = new Car(100, "white", 300000, 1500, "fuel", 4);
        System.out.println(vehicle.color);
        System.out.println(car.color); // ?
        System.out.println(car.powerType);
        System.out.println(car.tireNumber);

        Car carNew = new Car();
    }
}
