package interviewQuestions.Single;

/**
 * 1，2，3为饿汉式，没有线程安全问题 ，在类初始化是直接创建对象
 */
public class test {
    public static void main(String[] args) {
        Singleton1 s=Singleton1.INSTANCE;
        System.out.println(s);

        Singleton2 s2=Singleton2.INSTANCE;
        System.out.println(s2);

        Singleton3 s3=Singleton3.INSTANCE;
        System.out.println(s3);
    }
}
