/**
 * Created by Administrator
 * 2016/12/7
 */
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {
        int grade = 76;
        System.out.println((grade >= 90) ? "A" : ((grade >= 60 && grade <= 89) ? "B" : "C"));
    }
}
