package interviewQuestions.Single;

/**
 * 懒汉式，延迟创建实例，提供一个静态方法来获取实例对象
 * 增加一个同步锁以后，便是线程安全的，但是性能较差
 */
public class Singleton5 {
   private static Singleton5 instance;

    public Singleton5() {
    }

    public static Singleton5 getInstance(){
        if(instance==null) {             //加了这行以后，只有第一次会用到同步锁，效率更高
            synchronized (Singleton5.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton5();
                }
            }

        }

        return instance;
    }

}
