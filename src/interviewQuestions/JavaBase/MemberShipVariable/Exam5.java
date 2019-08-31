package interviewQuestions.JavaBase.MemberShipVariable;

public class Exam5 {
    static int s;   //类变量   存在方法区
    int i;      //实例变量  存在堆
    int j;
    {
        int i=1;
        i++;     //就近原则，此处i为第8行的i
        j++;
        s++;    //局部变量存在栈中
    }
    public void test(int j){
        j++;  //就近原则
        i++;  //此处找的是第5行的i，第8行的i作用域结束了
        s++;
    }

    public static void main(String[] args) {
        Exam5 obj1=new Exam5();
        Exam5 obj2=new Exam5();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);  //2,1,5
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);  //1,1,5
    }
}
