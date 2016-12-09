/**
 * Created by Administrator
 * 2016/12/8
 */
// class = field + method
class Human { // Alt + 7
    String name;
    int age;
    char gender;
    double height;
    double weight;
    boolean isMarried;

    Human() {

    }

//    Human() { // 构造方法 构造器 constructor
//        // 1. 没有返回类型
//        // 2. 方法与类同名
//    }
/*

    Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }
*/
    // Alt + Insert - Constructor - Ctrl + A - Enter
    public Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    // Ctrl + Shift + '+' / '-'
    String study(int i, String s) { // 形式参数   形参
        System.out.println(name + " study...");
        return s + i;
    }

    int work() {
        study(1, ""); // invoke method  实际参数   实参
//        System.out.println(name + "work...");
        for (int i = 0; i < 10; i++) {
            if (height > 1.8) {
                return 1;
            }
        }
//        System.out.println("....");
        return 100;
    }

    public static void main(String[] args) {
        Human human = new Human("zhangsan", 18, '男', 1.7, 60, false); // Ctrl + p (parameter)
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);
        System.out.println(human.isMarried);

        human.study(1, "");
        human.work();

        System.out.println(human.work());
        System.out.println(human.study(2, "test"));

//        Human lisi = new Human()
    }
}
