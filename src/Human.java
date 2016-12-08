/**
 * Created by Administrator
 * 2016/12/8
 */
// class = field + method
class Human {
    String name;
    int age;
    char gender;
    double height;
    double weight;
    boolean isMarried;

//    Human() { // 构造方法 构造器 constructor
//        // 1. 没有返回类型
//        // 2. 方法与类同名
//    }

    // Ctrl + Shift + '+' / '-'
    String study(int i, String s) { // 形式参数   形参
        System.out.println(name + " study...");
        return s + i;
    }

    void work() {
        study(1, ""); // invoke method  实际参数   实参
        System.out.println(name + "work...");
        for (int i = 0; i < 10; i++) {
            if (height > 1.8) {
                return;
            }
        }
        System.out.println("....");
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);
        System.out.println(human.isMarried);

        human.study(1, "");
        human.work();
    }
}
