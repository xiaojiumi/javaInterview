package interviewQuestions.Single;

/**
 * 饿汉式，直接创建对象
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE=new Singleton1();
    private Singleton1(){

    }
}
