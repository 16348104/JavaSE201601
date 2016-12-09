/**
 * Created by Administrator
 * 2016/12/9
 */

// Shape 形状
// 求周长，求面积
// 正方形，长方形，圆形，三角形
// 测试类
public class Shape {
    double getPerimeter() {
        return 0;
    }
    double getArea() {
        return 0;
    }
}
class Square extends Shape {
    double length; // 边长

    public Square(double length) {
        this.length = length;
    }

    double getPerimeter() {
        return length * 4;
    }

    double getArea() {
        return length * length;
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(1.5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}

