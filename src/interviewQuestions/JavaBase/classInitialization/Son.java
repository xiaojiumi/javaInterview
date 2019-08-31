package interviewQuestions.JavaBase.classInitialization;

/**
 *  1.j =method();
 *  2.静态代码块
 * 先初始化父类 5 1
 * 初始化子类 10 6
 *
 * 子类的实例化方法
 * 1 super()   9   3     2
 * 2 i=test();   9
 * 3 非静态代码块  8
 * 4 子类的无参构造  7
 *
 *
 * 因为创建了两个Son对象，实例化方法执行了两次
 */
public class Son extends Father {
    private int i=test();
    private static int j =method();

    static{
        System.out.print("(6)");
    }
    Son(){
//         super();  子类构造器终一定会调用父类的构造器
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }
    public int test(){
        System.out.print("(9)");
        return 1;
    }
    public static int method(){
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1=new Son();
        System.out.println();
        Son s2=new Son();
    }
}
