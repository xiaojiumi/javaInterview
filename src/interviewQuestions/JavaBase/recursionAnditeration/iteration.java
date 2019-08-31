package interviewQuestions.JavaBase.recursionAnditeration;

import org.junit.Test;

/**
 * 循环迭代
 * f(1)=1,f(2)=2
 * f(3)=two+one
 * two=f(1),one=f(2)
 * f(4)=two+one
 * two=f(2),one=f(3)
 * ->f(x)=two+one
 * f(x)=f(x-2)+f(x-1)
 * two=f(x-2),one=f(x-1)
 */
public class iteration {

    public int loop(int n) {
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return n;
        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;

    }

    @Test
    public void test2(){
        System.out.println(loop(2));
        //该方法效率比迭代高
    }
}
