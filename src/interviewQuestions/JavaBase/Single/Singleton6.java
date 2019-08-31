package interviewQuestions.JavaBase.Single;

/**
 * 在内部类被加载和初始化是，才会创建INSTANCE对象
 *静态内部类不会随着外部类的加载和初始化而初始化
 * 同时，类加载器保证了线程安全
 */
public class Singleton6 {
   private static Singleton6 instance;

    public Singleton6() {
    }

    private  static class Inner{
        private  static final Singleton6 INSTANCE=new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}
