package interviewQuestions.JavaBase.recursionAnditeration;

import org.junit.Test;

/**
 * n步台阶，一次走1或2步，共有几种走法
 * 1递归
 * n=1,f(1)=1
 * n=2,f(2)=2
 * n=3,f(3)=f(1)+f(2)  从f(1)跨2步或从f(2)跨1步
 * -> f(X)=f(X-1)+f(X-2)
 */
public class recursion {

    @Test
    public void test1(){

        System.out.println(f(2));
    }


    public int f(int n){
        if(n<1) {
            throw new IllegalArgumentException();
        }
        if(n==1|| n==2) {
            return n;
        }
        return f(n-2)+f(n-1);
    }


}
