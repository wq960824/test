import paixu.Fibn;
import paixu.MyArrayList;
import paixu.Number;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        System.out.println("你");
        Fibn fibn=new Fibn();
        System.out.println(fibn.Fibonacci(10));
        System.out.println(Integer.bitCount(4));
        Number number=new Number();
        System.out.println(number.NumberOf1(3));
        System.out.println(number.judgeSquareSum(32));
        int arr[]=new int[]{-1, -1};
        System.out.println(Arrays.toString(arr));
        long l=number.gec(50,15);
        System.out.println(l);
        MyArrayList arrayList=new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.remove(3));
        System.out.println(arrayList.toString());
    }
}
