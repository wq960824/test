import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String args[]){
        ReentrantLock lock = new ReentrantLock();

        for (int i = 1; i <= 3; i++) {
            lock.lock();
        }

        for(int i=1;i<=3;i++){
            try {

            } finally {
                lock.unlock();
                System.out.println(i);
            }
        }
        int a=Integer.MAX_VALUE-1;
        int b=a-2;
        int c=0;
       for (int i=b;i<=a;i++){
            c++;
            System.out.println(c);
       }
    }

}
