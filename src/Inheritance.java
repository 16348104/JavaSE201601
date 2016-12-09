/**
 * Created by Administrator
 * 2016/12/9
 */
public class Inheritance {
    public static void main(String[] args) {
        D d = new D();
        d.d();
        d.c();
        d.b();
        d.a();
    }
}

class A {
    void a() {
        System.out.println("a...");
    }
}
class B extends A {
    void b() {
        System.out.println("b...");
    }
}
class C extends B {
    void c() {
        System.out.println("c...");
    }
}
class D extends C {
    void d() {
        System.out.println("d...");
    }
}
