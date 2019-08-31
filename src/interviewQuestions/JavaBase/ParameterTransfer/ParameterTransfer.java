package interviewQuestions.JavaBase.ParameterTransfer;

import java.util.Arrays;

public class ParameterTransfer {
    public static void main(String[] args) {
        int i=1;
        String str="hello";
        Integer num=200;
        int[] arr={1,2,3,4,5};
        MyData my=new MyData();

        change(i,str,num,arr,my); //形参是基本数据类型，传递数据值
                                    //实参是引用数据类型，传递地址值
        System.out.println("i："+i);
        System.out.println("str："+str);  //字符串对象不可变 String，包装类对象不可变性，
        System.out.println("num："+num);
        System.out.println("arr："+ Arrays.toString(arr));
        System.out.println("my.a："+my.a);
    }
    public static void change(int j,String s,Integer n,int[] a,MyData m){
        j+=1;    //这里将j变成了2
        s+="world";  //s指向拼接后产生了新的字符串，
        n+=1;  //指向产生值为201的新的对象
        a[0]+=1;  //这里通过地址改的是a[0]的数据
        m.a+=1;
    }
}
