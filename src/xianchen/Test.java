package xianchen;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String args[]){

        Thread t=new Thread(Test::Basic);
        t.start();
        ReentrantLock lock=new ReentrantLock();
        lock.lock();
        lock.unlock();

    }
    static void Basic(){
        System.out.println("这是一个线程");
    }
}
