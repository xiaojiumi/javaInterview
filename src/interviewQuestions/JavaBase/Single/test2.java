package interviewQuestions.JavaBase.Single;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 懒汉式在多线程会有安全问题
 */
public class test2 {

    @Test
    public void testSingle4() throws  Exception{
        Callable<Singleton4> c=()->Singleton4.getInstance();
        ExecutorService es= Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);
        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
