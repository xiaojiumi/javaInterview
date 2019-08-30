package interviewQuestions.Single;

/**
 * 懒汉式，延迟创建实例，提供一个静态方法来获取实例对象
 */
public class Singleton4 {
   private static Singleton4 instance;

    public Singleton4() {
    }

    public static Singleton4 getInstance(){
        if(instance==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new Singleton4();
        }

        return instance;
    }

}
