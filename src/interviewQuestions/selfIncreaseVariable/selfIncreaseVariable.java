package interviewQuestions.selfIncreaseVariable;

import org.junit.Test;

public class selfIncreaseVariable {

    //赋值=，最后计算
    //=右边从左到右依次压入操作数栈
    //自增直接修改变量的值，不经过数栈
    //建议阅读JVM虚拟机关于指令的部分

    @Test
    public void test1(){
        int i=1;
        i=i++; //i的值压入操作数栈，i变量自增1，操作数栈的值又赋值给i，所以i的值还是1
        int j=i++;
        int k=i+++i*i++;
        System.out.println("i:"+i); //4
        System.out.println("j:"+j);  //1
        System.out.println("k:"+k); //11
    }
}
