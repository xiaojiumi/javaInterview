package interviewQuestions.JavaBase.classInitialization;

/**
 * 1.j =method();
 * 2.静态代码块
 * 父类的实例化方法
 * 1 super()
 * 2 i=test();   9
 * 3 非静态代码块   3
 * 4 父类的无参构造  2
 *
 * 非静态方法前面有一个默认的this
 * this在表示的是正在创建的对象，这里再创建Son对象
 * 所以test（）执行的是子类重写的代码 -面向对象多态
 */
public class Father {
    private int i=test();
    private static int j =method();

    static{
        System.out.print("(1)");
    }
    Father(){
        System.out.print("(2)");
    }
    {
        System.out.print("(3)");
    }
    public int test(){
        System.out.print("(4)");
        return 1;
    }
    public static int method(){
        System.out.print("(5)");
        return 1;
    }
}
