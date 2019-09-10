package xianchen;

public class Test {
    public static void main(String args[]){

        Thread t=new Thread(Test::Basic);
        t.start();
    }
    static void Basic(){
        System.out.println("这是一个线程");
    }
}
